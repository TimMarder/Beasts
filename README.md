Team Beasts -- Tim Marder, William Lu, Max Millar

APCS2 pd2

L00 -- But What Does the Data Say?

2018-02-09 F

### Hypothesis:
The worst case runtime of MatrixFinder's Search() method increases at a linear rate with the size of the matrix.

### Background:


### Experiment Methodology:
We created a method that populates a matrix according to the given rule:  increasing from up to down and left to right.
We tested matrices with size 1000 * 1000, 1100 * 1100 ... 10000 * 10000. For each size we made 10 trials and took the average.

### Results:

![](Data/chart.png)

### Conclusions:
