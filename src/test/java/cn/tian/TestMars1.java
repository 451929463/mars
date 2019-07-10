package cn.tian;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
public class TestMars1 {
    @Test
    public void should_show_current_location(){
        MarsStartInfo msi = new MarsStartInfo(100,200,"0 0 N");
        assertThat(new Mars1(msi,"").toString(),is("0 0 N"));
        assertThat(new Mars1(msi,"F 10").toString(),is("0 10 N"));
        assertThat(new Mars1(msi,"B 10").toString(),is("0 0 N"));
        assertThat(new Mars1(msi,"B 20 F 10").toString() , is("0 -10 N"));
        assertThat(new Mars1(msi,"R R").toString(),is("0 -10 S"));
        assertThat(new Mars1(msi,"L L").toString(),is("0 -10 N"));
        assertThat(new Mars1(msi,"F 10").toString(),is("0 0 N"));
        assertThat(new Mars1(msi,"F 10 R B 10 L F 20 R F 20").toString(),is("10 30 E"));
        assertThat(new Mars1(msi,"B 10 L B 30 C W").toString(),is("命令终止，存在不可识别指令"));

    }
}
 