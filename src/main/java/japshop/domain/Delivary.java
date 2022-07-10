package japshop.domain;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.persistence.*;

@Entity
public class Delivary extends BaseEntity{

    @Id
    @GeneratedValue
    private Long id;

    private String city;
    private String street;
    private String zipcode;
    private DelivaryStatus status;

    @OneToOne(mappedBy = "delivary", fetch = FetchType.LAZY)
    private Order order;
}
