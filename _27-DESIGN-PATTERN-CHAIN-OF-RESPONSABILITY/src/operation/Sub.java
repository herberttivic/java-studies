package operation;

import chain.Chain;
import request.Req;

public class Sub implements Chain {
    private Chain chain;

    @Override
    public void execute(Req request) {
        if(request.getOperation().equals("sub")){
            int result = request.getNumber() - request.getFactor();
            System.out.println(request.getNumber()+" - "+request.getFactor()+ " = "+result);
        }
        else{
            System.out.println("selecione as opções são mult, div, sum e sub");;
        }
    }

    @Override
    public void nextChain(Chain chain) {
        this.chain = chain;
    }
}
