package section6

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
Map<Integer, String> mapDays = new HashMap<Integer, String>();
Range<Days> dayRange = Days.SUNDAY..Days.SATURDAY;
List<String> days = [];
dayRange.each {day -> {
    println day
    days.add(day.toString())
    mapDays.put(day.ordinal(), day.toString())

}}

println dayRange.size();
println dayRange.contains(Days.WEDNESDAY);
println dayRange.from;
println dayRange.to;


println days;
println days.size();
println days.pop();
println days;
days<<"Saturday"
println days;
println days[3];

println mapDays;
println mapDays.getClass().getName();
println mapDays.size();
println mapDays.values();
