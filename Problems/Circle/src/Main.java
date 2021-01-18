class Circle {

    double radius;

    double getLength() {
        return Math.PI * 2 * this.radius;
    }

    double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}