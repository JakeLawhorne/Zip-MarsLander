public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        if(status.Altitude > 5501){
            burn = 100;
        }else if(status.Velocity > 100){
            burn = 200;
        }else if(status.Altitude > status.Velocity){
            burn = 100;
        }else if(status.Altitude < status.Velocity && status.Altitude != 1){
            burn = 198;
        } else  if(status.Altitude == 100){
            burn = 198;
        } else burn = 100;

        System.out.println(burn); /*hack!*/
        return burn;
    }

}
