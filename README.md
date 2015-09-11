# CourseraAlgorithms
Решение задач с курса "Алгоритмы" Coursera.
Неделя 1

<b>Question 1</b>
(seed = 649967)
Give the id[] array that results from the following sequence of 6 union
operations on a set of 10 items using the quick-find algorithm.

    2-0 5-1 2-6 9-8 9-1 3-6 

Your answer should be a sequence of 10 integers, separated by whitespace.

Recall: our quick-find convention for the union operation p-q is to change id[p]
(and perhaps some other entries) but not id[q].

<b>Answer</b>
6 1 6 6 4 1 6 7 1 1

<b>Question 2</b>
(seed = 411855)
Give the id[] array that results from the following sequence of 9 union
operations on a set of 10 items using the weighted quick-union algorithm from lecture.

    9-3 7-4 7-8 1-6 1-9 4-2 5-7 7-6 0-2 

Your answer should be a sequence of 10 integers, separated by whitespace.

Recall: when joining two trees of equal size, our weighted quick union convention is to
make the root of the second tree point to the root of the first tree. Also, our weighted
quick union algorithm performs union by size (number of nodes) -  not union by height -
and does not do path compression.

<b>Answer</b>
7 7 7 9 7 7 1 7 7 1
