package com.fun.grind;

public class FloodFill {
    public static void main(String[] args) {
        var image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};

        var newImage = floodFill(image, 1, 1, 2);
        for (int[] ints : newImage) {
            for (int intVal: ints) {
                System.out.println(intVal);
            }
        }
    }

    protected static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            if (image[sr][sc] == newColor) return image;

            fill(image, sr, sc, image[sr][sc], newColor);
            return image;
    }

    protected static void fill(int[][] image, int sr, int sc, int previousColor, int newColor) {
        //Check that:
        // starting color is equal to previous color
        // the starting row and color are greater than 0
        // starting row and starting color are not greater than or equal to the length of the array.
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != previousColor) {
            return;
        }

        image[sr][sc] = newColor;
        //Uses depth first search
        fill(image, sr-1, sc, previousColor, newColor); //Row above (top)
        fill(image, sr+1, sc, previousColor, newColor); //Row below (bottom)
        fill(image, sr, sc-1, previousColor, newColor); //Column to the left
        fill(image, sr, sc+1, previousColor, newColor); //Column to the right
    }
}

