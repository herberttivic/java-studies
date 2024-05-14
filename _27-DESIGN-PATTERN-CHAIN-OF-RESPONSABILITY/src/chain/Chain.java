package chain;

import request.Req;

public interface Chain {
    public void nextChain(Chain chain);
    public void execute(Req request);
}
