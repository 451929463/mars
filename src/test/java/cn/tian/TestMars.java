package cn.tian;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
public class TestMars {

    //@Test
    public void should_show_mars_car_start_location_info(){
        Mars mars = new Mars();
        assertThat(mars.toString(),is("0 0 N"));
    }

    @Test
    public void shoulde_show_mars_car_after_moving_location_info(){
         assertThat(new Mars("F 10").toString(),is("F 10 N"));
         assertThat(new Mars("F 10 R").toString(),is("0 10 E"));
         assertThat(new Mars("F 10 R F 10").toString(),is("10 10 E"));
         assertThat(new Mars("F 50 R F 50 L F 50 R F 50 R F 50 L L").toString(),is("100 50 N"));
         assertThat(new Mars("R F 100 L 100").toString(),is("100 0 N"));
         assertThat(new Mars("R F 100 L 100").toString(),is("100 0 N"));
         assertThat(new Mars("R F 100 L F 100 R B 100 L B 100").toString(),is("0 0 N"));
    }
}
 