package cn.tian;

public class MarsDisposeInstrctLeft extends MarsDisposeInstrct {
    public MarsDisposeInstrctLeft(MarsStartInfo marsStartInfo, String instrct) {
        super(marsStartInfo, instrct);
    }

    @Override
    public void run() {
        String temp = "";
        if(marsStartInfo.getStartDirction().equals(north)){
            temp = western ;
        }
        if(marsStartInfo.getStartDirction().equals(east)){
            temp = north ;
        }
        if(marsStartInfo.getStartDirction().equals(south)){
            temp = east ;
        }
        if(marsStartInfo.getStartDirction().equals(western)){
            temp = south ;
        }
        marsStartInfo.setStartDirction(temp);
    }
}
 