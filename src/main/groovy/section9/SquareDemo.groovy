package section9

Integer.metaClass.timesTwo = {delegate*2};

println 2.timesTwo();
println 3.timesTwo();
println 5.timesTwo();
println 6.timesTwo();

