public class SingleTonClassAgain {
    private static SingleTonClassAgain singleTonClassAgain;

    private SingleTonClassAgain(){}

    public static SingleTonClassAgain getInstance(){
        if(singleTonClassAgain == null){
            singleTonClassAgain = new SingleTonClassAgain();
        }
        return singleTonClassAgain;
    }
}
