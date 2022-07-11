package japshop.domain;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.persistence.*;

@Entity
public class Delivary extends BaseEntity{

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Address address;

    private DelivaryStatus status;

    @OneToOne(mappedBy = "delivary", fetch = FetchType.LAZY)
    private Order order;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
