package ge.tbc.testautomation.javaoop.figures;
    public class Circle {
        private double radius;

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        private static int numberOfCircleInstances = 0;
        public Circle(double radius) {
            this.radius = radius;
            numberOfCircleInstances++;
        }

    }

