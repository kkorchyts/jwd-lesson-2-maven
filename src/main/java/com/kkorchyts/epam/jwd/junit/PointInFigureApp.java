package com.kkorchyts.epam.jwd.junit;

import java.util.Scanner;

public class PointInFigureApp {
    static final String WRONG_VALUE_ENTERED_MESSAGE = "Please, enter the correct value!";
    static final String READ_X_MESSAGE = "Please, enter x: ";
    static final String READ_Y_MESSAGE = "Please, enter y: ";

    static final String READ_REGION_POINT_1_MESSAGE = "Enter Point 1:";
    static final String READ_REGION_POINT_2_MESSAGE = "Enter Point 2:";


    static final String POSITIVE_RESULT_MESSAGE = "Point is in the figure!";
    static final String NEGATIVE_RESULT_MESSAGE = "Point isn't in the figure!";

    static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static class Region {
        private final Point leftTop;
        private final Point rightBottom;

        public Region(Point point1, Point point2) {
            if (point1.getX() > point2.getX()) {
                Point tmp = point1;
                point1 = point2;
                point2 = tmp;
            }

            if (point1.getY() > point2.getY()) {
                leftTop = new Point(point1.getX(), point1.getY());
                rightBottom = new Point(point2.getX(), point2.getY());
            } else {
                leftTop = new Point(point1.getX(), point2.getY());
                rightBottom = new Point(point2.getX(), point1.getY());
            }
        }

        public Point getLeftTop() {
            return leftTop;
        }

        public Point getRightBottom() {
            return rightBottom;
        }
    }

    public static void printMessage(String message, boolean lineFeed) {
        if (lineFeed) {
            System.out.println(message);
        } else {
            System.out.print(message);
        }
    }

    public static int getInteger(String message) {
        Scanner scanner = new Scanner(System.in);
        do {
            printMessage(message, false);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                scanner.nextLine();
            }
            printMessage(WRONG_VALUE_ENTERED_MESSAGE, true);
        } while (true);
    }

    public static boolean pointIsInRegion(Region region, Point point) {
        if (point.getX() >= region.getLeftTop().getX() && point.getX() <= region.getRightBottom().getX()) {
            return point.getY() >= region.getRightBottom().getY() && point.getY() <= region.getLeftTop().getY();
        }
        return false;
    }

    public static boolean pointIsInFigure(Region[] regions, Point point) {
        boolean result = false;
        for (int i = 0; i < regions.length && !result; i++) {
            result = pointIsInRegion(regions[i], point);
        }
        return result;
    }

    public static Point readPoint(String message) {
        printMessage(message, true);
        return new Point(getInteger(READ_X_MESSAGE),
                getInteger(READ_Y_MESSAGE));
    }

    public static Region readRegion(String message) {
        printMessage(message, true);
        Point left = readPoint(READ_REGION_POINT_1_MESSAGE);
        Point right = readPoint(READ_REGION_POINT_2_MESSAGE);
        return new Region(left, right);
    }

    public static void printResultPointIsInFigure(boolean result) {
        if (result) {
            printMessage(POSITIVE_RESULT_MESSAGE, true);
        } else {
            printMessage(NEGATIVE_RESULT_MESSAGE, true);
        }
    }

    public static void main(String[] args) {
        printMessage(" --- Task 4: Check if point is in a region --- ", true);
        int regionsCount = 2;
        Region[] regions = new Region[regionsCount];

        for (int i = 0; i < regionsCount; i++) {
            regions[i] = readRegion(String.format("Enter region %d:", i + 1));
        }

        printMessage("Checking if the point is in a region:", true);
        Point point = readPoint("Enter Point:");
        boolean result = pointIsInFigure(regions, point);

        printResultPointIsInFigure(result);
    }
}
