package com.kkorchyts.epam.jwd.junit;

import org.junit.Assert;
import org.junit.Test;

public class RegionCreationTest {

    @Test
    public void regionCreationPointInRightOrderTest() {
        PointInFigureApp.Point point1 = new PointInFigureApp.Point(-2, 4);
        PointInFigureApp.Point point2 = new PointInFigureApp.Point(2, 0);
        PointInFigureApp.Region region = new PointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point1.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point1.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point2.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point2.getY(), region.getRightBottom().getY());
    }

    @Test
    public void regionCreationPointInWrongOrderTest() {
        PointInFigureApp.Point point1 = new PointInFigureApp.Point(2, 0);
        PointInFigureApp.Point point2 = new PointInFigureApp.Point(-2, 4);
        PointInFigureApp.Region region = new PointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point2.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point2.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point1.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point1.getY(), region.getRightBottom().getY());
    }

    @Test
    public void regionCreationPointInRightOrderWrongYOrderTest() {
        PointInFigureApp.Point point1 = new PointInFigureApp.Point(-2, 0);
        PointInFigureApp.Point point2 = new PointInFigureApp.Point(2, 4);
        PointInFigureApp.Region region = new PointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point1.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point2.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point2.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point1.getY(), region.getRightBottom().getY());
    }

    @Test
    public void regionCreationPointInWrongOrderWrongXOrderTest() {
        PointInFigureApp.Point point1 = new PointInFigureApp.Point(2, 4);
        PointInFigureApp.Point point2 = new PointInFigureApp.Point(-2, 0);
        PointInFigureApp.Region region = new PointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point2.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point1.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point1.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point2.getY(), region.getRightBottom().getY());
    }

    // XEquals
    @Test
    public void regionCreationPointInRightOrderXEqualsTest() {
        PointInFigureApp.Point point1 = new PointInFigureApp.Point(0, 4);
        PointInFigureApp.Point point2 = new PointInFigureApp.Point(0, 0);
        PointInFigureApp.Region region = new PointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point1.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point1.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point2.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point2.getY(), region.getRightBottom().getY());
    }

    @Test
    public void regionCreationPointInWrongOrderXEqualsTest() {
        PointInFigureApp.Point point1 = new PointInFigureApp.Point(0, 0);
        PointInFigureApp.Point point2 = new PointInFigureApp.Point(0, 4);
        PointInFigureApp.Region region = new PointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point2.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point2.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point1.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point1.getY(), region.getRightBottom().getY());
    }

    // YEquals
    @Test
    public void regionCreationPointInRightOrderYEqualsTest() {
        PointInFigureApp.Point point1 = new PointInFigureApp.Point(-2, 0);
        PointInFigureApp.Point point2 = new PointInFigureApp.Point(2, 0);
        PointInFigureApp.Region region = new PointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point1.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point1.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point2.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point2.getY(), region.getRightBottom().getY());
    }

    @Test
    public void regionCreationPointInWrongOrderYEqualsTest() {
        PointInFigureApp.Point point1 = new PointInFigureApp.Point(2, 0);
        PointInFigureApp.Point point2 = new PointInFigureApp.Point(-2, 0);
        PointInFigureApp.Region region = new PointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point2.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point2.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point1.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point1.getY(), region.getRightBottom().getY());
    }
}