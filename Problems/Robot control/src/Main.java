class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        if (toX >= robot.getX() && toY >= robot.getY()) {
            moveRobotFirst(robot, toX, toY);
        } else if (toX <= robot.getX() && toY >= robot.getY()) {
            moveRobotSecond(robot, toX, toY);
        } else if (toX <= robot.getX() && toY <= robot.getY()) {
            moveRobotThird(robot, toX, toY);
        } else if (toX >= robot.getX() && toY <= robot.getY()) {
            moveRobotFourth(robot, toX, toY);
        }
    }

    public static void moveRobotFirst(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
        } else if (robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
        }
        if (robot.getDirection() == Direction.RIGHT) {
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if (robot.getDirection() == Direction.UP) {
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
        if (toX != robot.getX()) {
            robot.turnRight();
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        } else if (toY != robot.getY()) {
            robot.turnLeft();
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }

    public static void moveRobotSecond(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
        } else if (robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
        }

        if (robot.getDirection() == Direction.LEFT) {
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if (robot.getDirection() == Direction.UP) {
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
        if (toX != robot.getX()) {
            robot.turnLeft();
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        } else if (toY != robot.getY()) {
            robot.turnRight();
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }

    public static void moveRobotThird(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.UP) {
            robot.turnLeft();
        } else if (robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
        }

        if (robot.getDirection() == Direction.LEFT) {
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if (robot.getDirection() == Direction.DOWN) {
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
        if (toX != robot.getX()) {
            robot.turnRight();
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        } else if (toY != robot.getY()) {
            robot.turnLeft();
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }

    public static void moveRobotFourth(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
        } else if (robot.getDirection() == Direction.UP) {
            robot.turnRight();
        }

        if (robot.getDirection() == Direction.RIGHT) {
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if (robot.getDirection() == Direction.DOWN) {
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
        if (toX != robot.getX()) {
            robot.turnLeft();
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        } else if (toY != robot.getY()) {
            robot.turnLeft();
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
        System.out.println("turnLeft");
    }

    public void turnRight() {
        direction = direction.turnRight();
        System.out.println("turnRight");
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
        System.out.println("stepForward");
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}