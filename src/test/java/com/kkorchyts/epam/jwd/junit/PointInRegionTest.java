package com.kkorchyts.epam.jwd.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PointInRegionTest {
    public static PointInFigureApp.Region region;

    static {
        PointInFigureApp.Point regionPoint1 = new PointInFigureApp.Point(-4, 4);
        PointInFigureApp.Point regionPoint2 = new PointInFigureApp.Point(4, -4);
        region = new PointInFigureApp.Region(regionPoint1, regionPoint2);
    }

    @Test
    public void pointInRegionTest() {
        List<PointInFigureApp.Point> points =  new ArrayList<>();
        points.add(new PointInFigureApp.Point(2, 2));
        points.add(new PointInFigureApp.Point(-4, 4));
        points.add(new PointInFigureApp.Point(-4, 3));
        points.add(new PointInFigureApp.Point(-4, -3));
        points.add(new PointInFigureApp.Point(-4, -4));

        points.add(new PointInFigureApp.Point(-3, 4));
        points.add(new PointInFigureApp.Point(-3, 3));
        points.add(new PointInFigureApp.Point(-3, -3));
        points.add(new PointInFigureApp.Point(-3, -4));


        points.add(new PointInFigureApp.Point(3, 4));
        points.add(new PointInFigureApp.Point(3, 3));
        points.add(new PointInFigureApp.Point(3, -3));
        points.add(new PointInFigureApp.Point(3, -4));

        points.add(new PointInFigureApp.Point(4, 4));
        points.add(new PointInFigureApp.Point(4, 3));
        points.add(new PointInFigureApp.Point(4, -3));
        points.add(new PointInFigureApp.Point(4, -4));

        for (PointInFigureApp.Point point: points) {
            Assert.assertTrue(PointInFigureApp.pointIsInRegion(region, point));
        }
    }

    @Test
    public void pointNotInRegionTest() {
        List<PointInFigureApp.Point> points =  new ArrayList<>();
        points.add(new PointInFigureApp.Point(-10, 10));
        points.add(new PointInFigureApp.Point(-10, 5));
        points.add(new PointInFigureApp.Point(-10, 4));
        points.add(new PointInFigureApp.Point(-10, 3));
        points.add(new PointInFigureApp.Point(-10, 0));
        points.add(new PointInFigureApp.Point(-10, -3));
        points.add(new PointInFigureApp.Point(-10, -4));
        points.add(new PointInFigureApp.Point(-10, -5));
        points.add(new PointInFigureApp.Point(-10, -10));

        points.add(new PointInFigureApp.Point(-5, 10));
        points.add(new PointInFigureApp.Point(-5, 5));
        points.add(new PointInFigureApp.Point(-5, 4));
        points.add(new PointInFigureApp.Point(-5, 3));
        points.add(new PointInFigureApp.Point(-5, 0));
        points.add(new PointInFigureApp.Point(-5, -3));
        points.add(new PointInFigureApp.Point(-5, -4));
        points.add(new PointInFigureApp.Point(-5, -5));
        points.add(new PointInFigureApp.Point(-5, -10));

        points.add(new PointInFigureApp.Point(5, 10));
        points.add(new PointInFigureApp.Point(5, 5));
        points.add(new PointInFigureApp.Point(5, 4));
        points.add(new PointInFigureApp.Point(5, 3));
        points.add(new PointInFigureApp.Point(5, 0));
        points.add(new PointInFigureApp.Point(5, -3));
        points.add(new PointInFigureApp.Point(5, -4));
        points.add(new PointInFigureApp.Point(5, -5));
        points.add(new PointInFigureApp.Point(5, -10));

        points.add(new PointInFigureApp.Point(10, 10));
        points.add(new PointInFigureApp.Point(10, 5));
        points.add(new PointInFigureApp.Point(10, 4));
        points.add(new PointInFigureApp.Point(10, 3));
        points.add(new PointInFigureApp.Point(10, 0));
        points.add(new PointInFigureApp.Point(10, -3));
        points.add(new PointInFigureApp.Point(10, -4));
        points.add(new PointInFigureApp.Point(10, -5));
        points.add(new PointInFigureApp.Point(10, -10));

        for (PointInFigureApp.Point point: points) {
            Assert.assertFalse(PointInFigureApp.pointIsInRegion(region, point));
        }
    }

    @Test
    public void pointNotInRegionXInYNotTest() {
        List<PointInFigureApp.Point> points =  new ArrayList<>();
        points.add(new PointInFigureApp.Point(-4, 10));
        points.add(new PointInFigureApp.Point(-4, 5));
        points.add(new PointInFigureApp.Point(-4, -5));
        points.add(new PointInFigureApp.Point(-4, -10));

        points.add(new PointInFigureApp.Point(-3, 10));
        points.add(new PointInFigureApp.Point(-3, 5));
        points.add(new PointInFigureApp.Point(-3, -5));
        points.add(new PointInFigureApp.Point(-3, -10));

        points.add(new PointInFigureApp.Point(0, 10));
        points.add(new PointInFigureApp.Point(0, 5));
        points.add(new PointInFigureApp.Point(0, -5));
        points.add(new PointInFigureApp.Point(0, -10));

        points.add(new PointInFigureApp.Point(3, 10));
        points.add(new PointInFigureApp.Point(3, 5));
        points.add(new PointInFigureApp.Point(3, -5));
        points.add(new PointInFigureApp.Point(3, -10));

        points.add(new PointInFigureApp.Point(4, 10));
        points.add(new PointInFigureApp.Point(4, 5));
        points.add(new PointInFigureApp.Point(4, -5));
        points.add(new PointInFigureApp.Point(4, -10));

        for (PointInFigureApp.Point point: points) {
            Assert.assertFalse(PointInFigureApp.pointIsInRegion(region, point));
        }
    }

    @Test
    public void pointNotInRegionXNotYInTest() {
        List<PointInFigureApp.Point> points =  new ArrayList<>();
        points.add(new PointInFigureApp.Point(10, -4));
        points.add(new PointInFigureApp.Point(5, -4));
        points.add(new PointInFigureApp.Point(-5, -4));
        points.add(new PointInFigureApp.Point(-10, -4));

        points.add(new PointInFigureApp.Point(10, -3));
        points.add(new PointInFigureApp.Point(5, -3));
        points.add(new PointInFigureApp.Point(-5, -3));
        points.add(new PointInFigureApp.Point(-10, -3));

        points.add(new PointInFigureApp.Point(10, 0));
        points.add(new PointInFigureApp.Point(5, 0));
        points.add(new PointInFigureApp.Point(-5, 0));
        points.add(new PointInFigureApp.Point(-10, 0));

        points.add(new PointInFigureApp.Point(10, 3));
        points.add(new PointInFigureApp.Point(5, 3));
        points.add(new PointInFigureApp.Point(-5, 3));
        points.add(new PointInFigureApp.Point(-10, 3));

        points.add(new PointInFigureApp.Point(10, 4));
        points.add(new PointInFigureApp.Point(5, 4));
        points.add(new PointInFigureApp.Point(-5, 4));
        points.add(new PointInFigureApp.Point(-10, 4));

        for (PointInFigureApp.Point point: points) {
            Assert.assertFalse(PointInFigureApp.pointIsInRegion(region, point));
        }
    }
}
