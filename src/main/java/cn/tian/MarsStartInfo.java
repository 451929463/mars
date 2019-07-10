package cn.tian;

public class MarsStartInfo {
    private int exploreMapX ;
    private int exploreMapY ;
    private int startX ;
    private int startY ;
    private String startDirction ;
    private String status ;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public String getStartDirction() {
        return startDirction;
    }

    public void setStartDirction(String startDirction) {
        this.startDirction = startDirction;
    }

    public MarsStartInfo(int exploreMapX , int exploreMapY , String startLocation ) {
       this.exploreMapX = exploreMapX ;
       this.exploreMapY = exploreMapY ;
       startX = Integer.valueOf(startLocation.split(" ")[0]);
       startY = Integer.valueOf(startLocation.split(" ")[1]);
       startDirction = startLocation.split(" ")[2];
    }

    @Override
    public String toString() {
        return "需要探索的地图范围：\n长："+exploreMapX +"\n宽"+exploreMapY +"\n当前位置信息(x,y,dirction)："+startX+" "+startY+" "+startDirction;
    }
}
 