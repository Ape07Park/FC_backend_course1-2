package fc00.model2;
@FunctionalInterface
public interface PersonFactory {
	public Person create(String name, int age);
}
