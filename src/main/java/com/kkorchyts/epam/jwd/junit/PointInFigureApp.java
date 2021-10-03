package com.kkorchyts.epam.jwd.junit;

import java.util.Scanner;

public class PointInFigureApp {
    static final String WRONG_VALUE_ENTERED_MESSAGE = "Please, enter the correct value!";
    static final String READ_X_MESSAGE = "Please, enter x: ";
    static final String READ_Y_MESSAGE = "Please, enter y: ";

    static final String POSITIVE_RESULT_MESSAGE = "Point is in the region";
    static final String NEGATIVE_RESULT_MESSAGE = "Point isn't in the region";

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

    public static Point readPoint() {
        return new Point(getInteger(READ_X_MESSAGE),
                getInteger(READ_Y_MESSAGE));
    }

    public static void printResult(boolean result) {
        if (result) {
            printMessage(POSITIVE_RESULT_MESSAGE,true);
        } else {
            printMessage(NEGATIVE_RESULT_MESSAGE, true);
        }
    }

    public static void main(String[] args) {
        printMessage(" --- Task 4: Check if point is in a region --- ", true);
        int regionsCount = 2;
        Region[] regions = new Region[regionsCount];

        for (int i = 0; i < regionsCount ; i++) {
            printMessage(String.format("Enter region %d:", i + 1), true);
            printMessage("Enter Point 1:", true);
            Point left = readPoint();
            printMessage("Enter Point 2:", true);
            Point right= readPoint();
            regions[i] = new Region(left, right);
        }

        printMessage("Checking if point is in a region:", true);
        printMessage("Enter Point:", true);
        Point point = readPoint();

        boolean result = pointIsInFigure(regions, point);

        printResult(result);
    }
}
