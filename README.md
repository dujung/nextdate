# nextdate
SQA NextDate Analysis

## Installation 

### Graphviz (Mac)

```bash
$ brew update
$ brew install graphviz
```

or 

connect 'http://www.webgraphviz.com/'

## NextDate Execution Graph

To generate graph image from '.dot' to '.png' image.
run `dot -Tpng nextdate.dot -o images/nextdate.png`.

![graphviz](/images/nextdate.png)


To Calulcate edges and nodes
run `gc -vne nextdate.dot`

| Nodes | Edges | Components |
|-------|-------|------------|
| 41    | 56    | 1          |


## Test Coverage

_cyclomatic number_ of graph
`V(G) = e – n + p`

So, V(G) = 56 – 41 + 1 = 16






