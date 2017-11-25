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

To gerenate graph image from '.dot' to 'png' 
run `dot -Tpng nextdate.dot -o images/nextdate.png`.

![graphviz](/images/nextdate.png)


To Calulcate edges and nodes
run `gc -vne nextdate.dot`

| Nodes | Edges |
|-------|-------|
| 37    | 51    |


## Test Coverage

_cyclomatic number_ of graph
`V(G) = e – n + p`

So, V(G) = 51 – 37 + 1 = 15





