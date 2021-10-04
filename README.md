# jwd-lesson-2-maven: Point in a figure

## Task 
Write an algorithm that allows checking if the point is in a figure. 

## Solution
1) Figure - is an array of regions (rectangles);
2) Region contains 2 Point (leftTop and rightTop). To create a rectangle user has to input 2 point in any order. During the region, the creation program chooses which coordinate would belong to leftTop or rightTop.
3) Point has 2 coordinates: x, y
4) There are methods for Points and Regions reading, methods for cheching if a Point is in a Region and in a Figure.

## Tests
1) RegionCreationTest covers cases for different combinations of Points.
2) PointInRegionTest contains tests for testing different cases (Point in a region, Point is outside of a region, one if coordinate in a region but another not).
3) PointInFigureTest contains tests for testing different cases (Point in a figure, Point is outside of the figure).
4) PointInFigureTestSuite - the suite of all tests described above. 


