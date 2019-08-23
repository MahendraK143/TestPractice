package Java8;

public class Transaction {
    private int id;
    private float price;
    private String currency;
    private String txType;

    public void setId(int id) {
        this.id = id;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTxType(String txType) {
        this.txType = txType;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getTxType() {
        return txType;
    }
    public Transaction(int id,float cost, String currency, String txType){
        this.id = id;
        this.price = cost;
        this.currency = currency;
        this.txType = txType;
    }
    @Override
    public String toString() {
        return "id:"+id+",price:"+price+",currency:"+currency;
    }
}
