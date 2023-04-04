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
}
