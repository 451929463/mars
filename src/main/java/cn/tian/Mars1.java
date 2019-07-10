package cn.tian;

public class Mars1 {
    private MarsStartInfo msi ;
    private String instrctString ;
    public Mars1(MarsStartInfo msi ,String instrctString) {
        MarsDisposeInstrct marsDisposeInstrct = null;
        String[] arr = instrctString.split(" ");
        for (int i = 0 ; i < arr.length ; i++ ){
            if (instrctString == ""){
                continue;
            }
            if(arr[i].equals("F")){
                marsDisposeInstrct = new MarsDisposeInstrctForword(msi,arr[i+1]);
                marsDisposeInstrct.run();
                i++;
                continue;
            }
            if(arr[i].equals("B")){
                marsDisposeInstrct = new MarsDisposeInstrctBackwords(msi,arr[i+1]);
                marsDisposeInstrct.run();
                i++;
                continue;
            }
            if(arr[i].equals("R")){
                marsDisposeInstrct = new MarsDisposeInstrctRight(msi,"");
                marsDisposeInstrct.run();
                continue;
            }
            if (arr[i].equals("L")){
                marsDisposeInstrct = new MarsDisposeInstrctLeft(msi,"");
                marsDisposeInstrct.run();
                continue;
            }
            System.out.println("======================命令有误或沿途受阻======================");
            msi.setStatus("命令终止，存在不可识别指令");
            break;

        }
        this.msi = msi ;
        this.instrctString = instrctString ;
    }

    @Override
    public String toString() {
        System.out.println(msi.toString());
        if(msi.getStatus() != null && msi.getStatus() != ""){
            return msi.getStatus() ;
        }
        return msi.getStartX()+" "+msi.getStartY()+" "+msi.getStartDirction();
    }
}
 