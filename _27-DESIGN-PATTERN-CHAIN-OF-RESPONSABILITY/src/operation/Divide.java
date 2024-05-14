package operation;

import chain.Chain;
import request.Req;

public class Divide implements Chain {
    private Chain chain;

    @Override
    public void execute(Req request) {
        if(request.getOperation().equals("div")){
            double result = (double) request.getNumber() / request.getFactor();
            System.out.println(request.getNumber()+" / "+request.getFactor()+ " = "+result);
        }else {
            chain.execute(request);
        }
    }

    @Override
    public void nextChain(Chain chain) {
        this.chain = chain;
    }
}
