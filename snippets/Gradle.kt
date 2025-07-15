androidx-lifecycle-livedata-ktx = { module = "androidx.lifecycle:lifecycle-livedata-ktx", version.ref = "lifecycleRuntimeKtx" }
androidx-lifecycle-viewmodel-ktx = { module = "androidx.lifecycle:lifecycle-viewmodel-ktx", version.ref = "lifecycleViewmodelKtx" }
firebase-firestore-ktx = { group = "com.google.firebase", name = "firebase-firestore-ktx", version.ref = "firebaseFirestoreKtx" }
coil-compose = { module = "io.coil-kt:coil-compose", version.ref = "coilKtx" }

lifecycleRuntimeKtx = "2.6.1"
lifecycleViewmodelKtx = "2.6.1"
coilKtx = "2.3.0"

implementation(libs.androidx.lifecycle.livedata.ktx)
implementation(libs.androidx.lifecycle.viewmodel.ktx)
implementation(libs.coil.compose)