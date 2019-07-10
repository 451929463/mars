package cn.tian;

public class MarsDisposeInstrctForword extends MarsDisposeInstrct {
    public MarsDisposeInstrctForword(MarsStartInfo marsStartInfo , String instrct) {
        super(marsStartInfo , instrct);
    }

    @Override
    public void run() {
        try {
            int temp = 0;
            if(marsStartInfo.getStartDirction().equals(north)){
                temp = marsStartInfo.getStartY() + Integer.valueOf(instrct);
                marsStartInfo.setStartY(temp);
            }
            if(marsStartInfo.getStartDirction().equals(south)){
                temp = marsStartInfo.getStartY() - Integer.valueOf(instrct);
                marsStartInfo.setStartY(temp);
            }
            if(marsStartInfo.getStartDirction().equals(east)){
                temp = marsStartInfo.getStartX() + Integer.valueOf(instrct);
                marsStartInfo.setStartX(temp);
            }
            if(marsStartInfo.getStartDirction().equals(western)){
                temp = marsStartInfo.getStartX() - Integer.valueOf(instrct);
                marsStartInfo.setStartX(temp);
            }
        }catch (Exception e){
            marsStartInfo.setStatus("命令终止，存在不可识别指令");
            System.out.println(e);
        }

    }
}
 