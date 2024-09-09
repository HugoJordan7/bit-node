## Build tools & versions used

[versions]


agp = "8.3.1"

kotlin = "1.9.0"

coreKtx = "1.13.1"

junit = "4.13.2"

junitVersion = "1.2.1"

espressoCore = "3.6.1"

lifecycleRuntimeKtx = "2.8.4"

activityCompose = "1.9.1"

composeBom = "2023.08.00"

gson = "2.11.0"

retrofit = "2.9.0"

koin_version = "3.5.0"

[libraries]

androidx-core-ktx = { group = "androidx.core", name = "core-ktx", version.ref = "coreKtx" }

junit = { group = "junit", name = "junit", version.ref = "junit" }

androidx-junit = { group = "androidx.test.ext", name = "junit", version.ref = "junitVersion" }

androidx-espresso-core = { group = "androidx.test.espresso", name = "espresso-core", version.ref = "espressoCore" }

androidx-lifecycle-runtime-ktx = { group = "androidx.lifecycle", name = "lifecycle-runtime-ktx", version.ref = "lifecycleRuntimeKtx" }

androidx-activity-compose = { group = "androidx.activity", name = "activity-compose", version.ref = "activityCompose" }

androidx-compose-bom = { group = "androidx.compose", name = "compose-bom", version.ref = "composeBom" }

androidx-ui = { group = "androidx.compose.ui", name = "ui" }

androidx-ui-graphics = { group = "androidx.compose.ui", name = "ui-graphics" }

androidx-ui-tooling = { group = "androidx.compose.ui", name = "ui-tooling" }

androidx-ui-tooling-preview = { group = "androidx.compose.ui", name = "ui-tooling-preview" }

androidx-ui-test-manifest = { group = "androidx.compose.ui", name = "ui-test-manifest" }

androidx-ui-test-junit4 = { group = "androidx.compose.ui", name = "ui-test-junit4" }

androidx-material3 = { group = "androidx.compose.material3", name = "material3" }

gson = { group = "com.google.code.gson", name = "gson", version.ref = "gson" }

retrofit = { group = "com.squareup.retrofit2", name = "retrofit", version.ref = "retrofit" }

retrofit-converter-gson = { group = "com.squareup.retrofit2", name = "converter-gson", version.ref = "retrofit" }

koin = { group = "io.insert-koin", name = "koin-android", version.ref = "koin_version" }


[plugins]

androidApplication = { id = "com.android.application", version.ref = "agp" }

jetbrainsKotlinAndroid = { id = "org.jetbrains.kotlin.android", version.ref = "kotlin" }


## Steps to run the app
Download it by clicking [here](https://github.com/HugoJordan7/bit-node/raw/main/BitNode.apk).

## What areas of the app did you focus on?
I focused first on the architecture of the project as a whole, and then on the application's UI. For this, I used the MVVM architecture and also Jetpack Compose. I also worked on concepts such as Dependency Injection with Koin.

## What was the reason for your focus? What problems were you trying to solve?
My main focus was to develop the application with the MVVM architecture and modularize the project as much as possible. I focused on producing code that not only solves the challenge, but is also readable. In addition, I also used Jetpack Compose since both items were the differentiators mentioned in the vacancy.

## How long did you spend on this project?
I spent approximately 5 hours.

## Did you make any trade-offs for this project? What would you have done differently with more time?
To solve the challenge in the suggested time (3-5 hours), I gave up writing unit tests. If I had more time, I would test the MainViewModel's success and failure cases with JUnit 4 and Mockk.

## What do you think is the weakest part of your project?
I focused on solving the challenge by writing clean and modularized code, with a modern architecture and a minimally pleasant interface. That's why I didn't have time to write unit tests. Security is definitely the weakest point of the project.

## Is there any other information you’d like us to know?
No, just what has already been said in the previous answers.
