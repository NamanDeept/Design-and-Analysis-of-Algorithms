a = importdata('input.txt');
c = importdata('output3.txt');
d = importdata('input1.txt');
e = importdata('output4.txt');
plot(a,c,'r');
hold on;
plot(d,e,'b');
legend('Worst Case','Best Case');