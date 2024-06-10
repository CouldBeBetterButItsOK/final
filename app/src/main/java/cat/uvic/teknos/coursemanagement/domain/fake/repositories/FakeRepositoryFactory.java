package cat.uvic.teknos.coursemanagement.domain.fake.repositories;

import cat.uvic.teknos.coursemanagement.repositories.*;

public class FakeRepositoryFactory implements RepositoryFactory {
    @Override
    public GenreRepository getGenreRepository() {
        return new FakeGenreRepository();
    }

    @Override
    public CourseRepository getCourseRepository() {
        return new FakeCourseRepository();
    }

    @Override
    public StudentRepository getStudentRepository() {
        return new FakeStudentRepository();
    }

    @Override
    public AddressRepository getAddressRepository() {
        return new FakeAddressRepository();
    }
}
