package cn.tian;
public class Mars {
    private int x = 0 ;
    private int y = 0 ;
    private String err = "";

    private Integer X = 100 ;
    private Integer Y = 200 ;
    private String direction = "N";
    private String[] dircetions = {"N" , "E" , "S" , "W"};
    private String[] instrcts = null;

    public Mars() {
    }
    public Mars(String instrct) {
        instrcts = instrct.split(" ");
        paserInstrct(instrct);
    }

    @Override
    public String toString() {
        if(err != ""){
            return err ;
        }
        System.out.println("==============火星车位置==============");
        System.out.println("区域面积："+X+"*"+Y+":"+X*Y+"平方米\n坐标位置：x="+x+",y="+y+"\n朝向："+direction);
        return x+" "+y+" "+direction;
    }

   private void paserInstrct(String instrct){
        for (int i = 0 ; i < instrcts.length ; i++){
            switch (instrcts[i]){
                case "R":
                   right_after_direction();
                    break;
                case "L":
                    left_after_direction();
                    break;
                case "F":
                    forward_after_location(instrcts[i+1]);
                    break;
                case "B":
                    backwards_after_location(instrcts[i+1]);
                    break;
                default:
                    break;
            }
        }
    }

    private void right_after_direction(){
        for (int i = 0 ; i < dircetions.length ; i ++ ){
            if (dircetions[i].equals(direction)){
                if (i == dircetions.length - 1 ){
                    direction = dircetions[0];
                }else{
                    direction = dircetions[i+1];
                }
                return ;
            }
        }
    }

    private void left_after_direction(){
        for (int i = 0 ; i < dircetions.length ; i ++ ){
            if (dircetions[i].equals(direction)){
                if (i == 0 ){
                    direction = dircetions[dircetions.length - 1];
                }else{
                    direction = dircetions[i-1];
                }
                return ;
            }
        }
    }

    private void forward_after_location(String param){
        int temp = Integer.valueOf(param);
        if(direction.equals("N")){
            y += temp;
        }
        if(direction.equals("S")){
            y -= temp;
        }
        if(direction.equals("W")){
            x -= temp;
        }
        if(direction.equals("E")){
            x += temp;
        }
    }

    private void backwards_after_location(String param){
        int temp = Integer.valueOf(param);
        if(direction.equals("N")){
            y -= temp;
        }
        if(direction.equals("S")){
            y += temp;
        }
        if(direction.equals("W")){
            x += temp;
        }
        if(direction.equals("E")){
            x -= temp;
        }
    }
}
 