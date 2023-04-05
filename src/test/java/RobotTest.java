import br.edu.ifsp.scl.Coordinate;
import br.edu.ifsp.scl.Robot;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RobotTest {
    @Test
    @DisplayName("Should be colliding")
    void ShouldBeColliding() {
        /* If the distance is 0, then the robot and the obstacle are colliding.
         * A collision means that the robot and the obstacle have the same coordinates.
         */

        Coordinate robotPosition = new Coordinate(0, 0);
        Robot robot = new Robot(robotPosition, 45);

        Coordinate obstaclePosition = robot.checkObstaclePosition(0, 0);

        assertThat(obstaclePosition).isEqualTo(robotPosition);
    }

    @Test
    @DisplayName("Obstacle coordinate should be (0, 5)")
    void ShouldBeZeroFive() {
        Coordinate robotPosition = new Coordinate(0, 0);
        Robot robot = new Robot(robotPosition, 45);

        Coordinate obstaclePosition = robot.checkObstaclePosition(45, 5);

        Coordinate expectedPosition = new Coordinate(0, 5);
        assertThat(obstaclePosition).isEqualTo(expectedPosition);
    }

    @Test
    @DisplayName("Obstacle coordinate should be (0, 4)")
    void ShouldBeZeroFour() {
        Coordinate robotPosition = new Coordinate(-4, 4);
        Robot robot = new Robot(robotPosition, 45);

        Coordinate obstaclePosition = robot.checkObstaclePosition(135, 4);

        Coordinate expectedPosition = new Coordinate(0, 4);
        assertThat(obstaclePosition).isEqualTo(expectedPosition);
    }

    @Test
    @DisplayName("Obstacle coordinate should be (0, 0)")
    void ShouldBeZeroZero() {
        Coordinate robotPosition = new Coordinate(6, 6);
        Robot robot = new Robot(robotPosition, 270);

        Coordinate obstaclePosition = robot.checkObstaclePosition(135, 8);

        Coordinate expectedPosition = new Coordinate(0, 0);
        assertThat(obstaclePosition).isEqualTo(expectedPosition);
    }
}
