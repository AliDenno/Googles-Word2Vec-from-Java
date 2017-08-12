public class Word2Vec {
    native void word2vecFromC(String link,String expression); /* (1) */
    static {
        System.loadLibrary("distance"); /* (2) */
    }
    static public void main(String argv[]) {
        Word2Vec word2vec = new Word2Vec();
	String link="/Resources/GoogleNews-vectors-negative300.bin";
	String expression="River";
        word2vec.word2vecFromC(link,expression); /* (3) */
    }
}


