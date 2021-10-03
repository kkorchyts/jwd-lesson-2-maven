package com.kkorchyts.epam.jwd.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PointInFigureTest {
    public static final PointInFigureApp.Region[] regions;

    static {
        regions = new PointInFigureApp.Region[2];
        PointInFigureApp.Point regionPoint1 = new PointInFigureApp.Point(-2, 4);
        PointInFigureApp.Point regionPoint2 = new PointInFigureApp.Point(2, 0);
        regions[0] = new PointInFigureApp.Region(regionPoint1, regionPoint2);

        regionPoint1 = new PointInFigureApp.Point(-4, 0);
        regionPoint2 = new PointInFigureApp.Point(4, -3);
        regions[1] = new PointInFigureApp.Region(regionPoint1, regionPoint2);
    }

    @Test
    public void pointInFigureTest() {
        List<PointInFigureApp.Point> points = new ArrayList<>();
        points.add(new PointInFigureApp.Point(1, 1));
        points.add(new PointInFigureApp.Point(-3, 0));
        points.add(new PointInFigureApp.Point(-1, -1));

        for (PointInFigureApp.Point point : points) {
            Assert.assertTrue(PointInFigureApp.pointIsInFigure(regions, point));
        }
    }

    @Test
    public void pointNotInFigureTest() {
        List<PointInFigureApp.Point> points = new ArrayList<>();
        points.add(new PointInFigureApp.Point(-3, 1));
        points.add(new PointInFigureApp.Point(-1, 5));
        points.add(new PointInFigureApp.Point(3, 2));

        for (PointInFigureApp.Point point : points) {
            Assert.assertFalse(PointInFigureApp.pointIsInFigure(regions, point));
        }
    }
}
