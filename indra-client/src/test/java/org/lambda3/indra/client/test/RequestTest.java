package org.lambda3.indra.client.test;

import org.lambda3.indra.client.RelatednessPairRequest;
import org.lambda3.indra.client.ScoreFunction;
import org.lambda3.indra.client.TextPair;
import org.testng.annotations.Test;

import javax.ws.rs.WebApplicationException;
import java.util.Collections;

public final class RequestTest {

    @Test(expectedExceptions = WebApplicationException.class)
    public void clientError1Test() {
        new RelatednessPairRequest().validate();
    }

    @Test(expectedExceptions = WebApplicationException.class)
    public void clientError2Test() {
        new RelatednessPairRequest()
                .corpus("any")
                .language("en")
                .model("w2v")
                .scoreFunction(ScoreFunction.COSINE)
                .validate();
    }

    @Test(expectedExceptions = WebApplicationException.class)
    public void clientError3Test() {
        new RelatednessPairRequest()
                .language("en")
                .model("w2v")
                .scoreFunction(ScoreFunction.COSINE)
                .pairs(Collections.singletonList(new TextPair("a", "b")))
                .validate();
    }

    @Test(expectedExceptions = WebApplicationException.class)
    public void clientError4Test() {
        new RelatednessPairRequest()
                .corpus("any")
                .model("w2v")
                .scoreFunction(ScoreFunction.COSINE)
                .pairs(Collections.singletonList(new TextPair("a", "b")))
                .validate();
    }

    @Test(expectedExceptions = WebApplicationException.class)
    public void clientError5Test() {
        new RelatednessPairRequest()
                .corpus("any")
                .language("en")
                .scoreFunction(ScoreFunction.COSINE)
                .pairs(Collections.singletonList(new TextPair("a", "b")))
                .validate();
    }

    @Test(expectedExceptions = WebApplicationException.class)
    public void clientError6Test() {
        new RelatednessPairRequest()
                .corpus("any")
                .language("en")
                .model("w2v")
                .pairs(Collections.singletonList(new TextPair("a", "b")))
                .validate();
    }

    @Test(expectedExceptions = WebApplicationException.class)
    public void clientError7Test() {
        new RelatednessPairRequest()
                .corpus("any")
                .language("en")
                .model("w2v")
                .validate();
    }

    @Test
    public void clientRequestWitouhtErrorTest() {
        new RelatednessPairRequest()
                .corpus("any")
                .language("en")
                .model("w2v")
                .scoreFunction(ScoreFunction.COSINE)
                .pairs(Collections.singletonList(new TextPair("a", "b")))
                .validate();
    }
}
