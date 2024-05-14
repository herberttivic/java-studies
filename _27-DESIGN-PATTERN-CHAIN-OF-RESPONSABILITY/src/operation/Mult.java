package operation;
import chain.Chain;
import request.Req;

public class Mult implements Chain {
    private Chain chain;

    @Override
    public void execute(Req request) {
        if(request.getOperation().equals("mult")){
            int result = request.getNumber() * request.getFactor();
            System.out.println(request.getNumber()+" x "+request.getFactor()+ " = "+result);
        }
        else {
            chain.execute(request);
        }
    }
    @Override
    public void nextChain(Chain chain) {
        this.chain=chain;
    }
}
