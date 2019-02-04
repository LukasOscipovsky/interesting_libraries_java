package oscipovsky.lukas.immutables;

import org.immutables.value.Value;

import java.util.List;
import java.util.Map;

@Value.Immutable
@Value.Style(jdkOnly = true)
public interface CollectionExample {
   // @AllowNulls List<String> a();
   // @SkipNulls List<String> b();
   // @AllowNulls Map<Integer, String> c();
   // @SkipNulls Map<Integer, String> d();
}
