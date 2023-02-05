import static java.util.stream.Collectors.*;
public class Solution {
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> results = new ArrayList<>();
    Map<Character, Long> balance = p.chars().boxed().collect(groupingBy(i -> (char) i.intValue(), counting()));
    for (int i = 0, remaining = balance.size(); i < s.length(); i++) {
      char prev = (i < p.length()) ? 0 : s.charAt(i - p.length());
      if (Objects.equals(1L, balance.computeIfPresent(prev, (k, v) -> v + 1)))
        remaining++;

      char next = s.charAt(i);
      if (Objects.equals(0L, balance.computeIfPresent(next, (k, v) -> v - 1)))
        remaining--;

      if (remaining == 0)
        results.add(i - p.length() + 1);
    }
    return results;
  }
}
