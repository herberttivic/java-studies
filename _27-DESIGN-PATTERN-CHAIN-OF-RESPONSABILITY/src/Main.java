import chain.Chain;
import operation.Divide;
import operation.Mult;
import operation.Sub;
import operation.Sum;
import request.Req;

public class Main {
    public static void main(String[] args)  {
        Req request = new Req(12,4, "sub");
        Chain chain1 = new Mult();
        Chain chain2 = new Divide();
        Chain chain3 = new Sum();
        Chain chain4 = new Sub();

        chain1.nextChain(chain2);
        chain2.nextChain(chain3);
        chain3.nextChain(chain4);

        chain1.execute(request);
    }
}