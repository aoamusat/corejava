public class StringTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hi, my name is Akeem!\n");
        builder.append("Today, I am learning Java\r");

        String ddlQuery = """
                    CREATE TABLE `account` (
                      `id` int NOT NULL AUTO_INCREMENT,
                      `backOfficeAccountNumber` varchar(15) DEFAULT NULL,
                      `virtualAcctNumber` varchar(15) DEFAULT NULL,
                      `accountName` varchar(50) DEFAULT NULL,
                      `currency` varchar(3) DEFAULT NULL,
                      `accountReference` varchar(32) DEFAULT NULL,
                      `expiryDate` datetime DEFAULT NULL,
                      `pingBackURL` varchar(250) DEFAULT NULL,
                      `bvn` varchar(15) DEFAULT NULL,
                      `status` varchar(20) DEFAULT NULL,
                      `createdAt` datetime NOT NULL,
                      `updatedAt` datetime NOT NULL,
                      `deletedAt` datetime DEFAULT NULL,
                      `merchantId` int DEFAULT NULL,
                      PRIMARY KEY (`id`) USING BTREE,
                      UNIQUE KEY `virtualAcctNumber` (`virtualAcctNumber`) USING BTREE,
                      UNIQUE KEY `account_virtualAcctNumber_unique` (`virtualAcctNumber`) USING BTREE,
                      KEY `merchantId` (`merchantId`) USING BTREE,
                      CONSTRAINT `account_ibfk_1` FOREIGN KEY (`merchantId`) REFERENCES `merchant` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
                    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
                """;

        System.out.println(ddlQuery);
        System.out.printf("%,.2f", 100340004500.0 / 2.0);
    }
}
