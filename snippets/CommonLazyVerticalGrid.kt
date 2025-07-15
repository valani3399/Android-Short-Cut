@Composable
fun <T> CommonLazyVerticalGrid(
    itemsList: List<T>,
    modifier: Modifier = Modifier,
    columns: Int = 2,
    contentPadding: PaddingValues = PaddingValues(16.dp),
    horizontalSpacing: Dp = 10.dp,
    verticalSpacing: Dp = 10.dp,
    itemContent: @Composable (T) -> Unit,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(columns),
        modifier = modifier.fillMaxSize(),
        contentPadding = contentPadding,
        horizontalArrangement = Arrangement.spacedBy(horizontalSpacing),
        verticalArrangement = Arrangement.spacedBy(verticalSpacing)
    ) {
        items(itemsList) { item ->
            itemContent(item)
        }
    }
}
