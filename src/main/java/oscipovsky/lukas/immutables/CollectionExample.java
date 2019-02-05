package oscipovsky.lukas.immutables;

import org.immutables.fixture.nullable.AllowNulls;
import org.immutables.fixture.nullable.SkipNulls;
import org.immutables.value.Value;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Value.Immutable
@Value.Style(jdkOnly = true)
public interface CollectionExample {
    @AllowNulls List<String> a();
    @SkipNulls List<String> b();
    @AllowNulls Map<Integer, String> c();
    @SkipNulls Map<Integer, String> d();

    public static void main(String... args) {
        List<String> strings = Arrays.asList("sad", null);
        ImmutableCollectionExample build = ImmutableCollectionExample.builder().a(strings).b(strings).build();
        System.out.println(build);
    }
}
