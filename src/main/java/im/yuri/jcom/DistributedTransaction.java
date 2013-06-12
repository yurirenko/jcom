package im.yuri.jcom;

import java.util.UUID;

public class DistributedTransaction {

    private Transaction[] transactions;
    private UUID id;

    public DistributedTransaction() {
        id = UUID.randomUUID();
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
        for (Transaction t : transactions) {
            t.setId(id);
        }
    }


}
