package cn.tian;

public class MarsDisposeInstrctRight extends MarsDisposeInstrct{
    public MarsDisposeInstrctRight(MarsStartInfo marsStartInfo, String instrct) {
        super(marsStartInfo, instrct);
    }

    @Override
    public void run() {
        String temp = "";
        if(marsStartInfo.getStartDirction().equals(north)){
            temp = east ;
        }
        if(marsStartInfo.getStartDirction().equals(east)){
            temp = south ;
        }
        if(marsStartInfo.getStartDirction().equals(south)){
            temp = western ;
        }
        if(marsStartInfo.getStartDirction().equals(western)){
            temp = north ;
        }
        marsStartInfo.setStartDirction(temp);
    }
}
 