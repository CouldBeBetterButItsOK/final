package cat.uvic.teknos.coursemanagement.domain.fake.repositories;

import cat.uvic.teknos.coursemanagement.models.Address;
import cat.uvic.teknos.coursemanagement.repositories.AddressRepository;

import java.util.Set;

public class FakeAddressRepository implements AddressRepository {
    @Override
    public void save(Address model) {

    }

    @Override
    public void delete(Address model) {

    }

    @Override
    public Address get(Integer id) {
        return null;
    }

    @Override
    public Set<Address> getAll() {
        return Set.of();
    }
}
