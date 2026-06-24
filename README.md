# Assignment 1 - Animals and Sounds                                                                     

## Step 1: Download Android Studio                                                                     
Download [Android Studio](https://developer.android.com/studio)                                                                       

## Step 2: Install Android Studio                                                                                                                                                                                                               
Install Android Studio.                                                         
                                                         
## Step 3: Launch Android Studio                                                                                                                                                                             
Launch Android Studio.                                                                                                                      
                                                           
## Step 4: Android Studio "New Project" "Empty Activity" "Next", Enter Project Details                                                           
Project Name: AnimalsAndSounds                                                             
Package Name: Use the automatically generated package name.                                                             
Language: Kotlin                                                             
Build Configuration Language: Kotlin DSL                                                             
Minimum SDK: Select the default recommended SDK or API 24 and above.                                                           
                                                           
Click "Finish". Android Studio will create the project and download the required dependencies. Wait until Android Studio completes the Gradle synchronization. Make sure there are no build errors by checking the status bar at the bottom.                                                           
                                                           
## Step 5: Understanding the Project Structure. Note the following foldres and files                                                           
- manifests                                                           
- kotlin + java                                                           
- res                                                           
                                                           
### manifests folder                                                           
- AndroidManifest.xml file containing App name, Activities, Permissions, App Configuration                                                           
                                                           
### kotlin + java folder                                                           
- MainActivity.kt - starting point of the application.                                                           
  - onCreate() method                                                           
  - setContent() method - displays the Compose UI.                                                           
                                                           
### res                                                           
- drawable - to store images used by the application. eg. cat.png, dog.png                                                           
- raw - to store audio files, videos. eg. meow.mp3, bowbow.mp3                                                           
                                                           
## Step 6: Creating Android Emulator                                                           
- Tools-Device Manager-Create Device-Select Phone Model-API-Android Version. eg Pixel 7, Pixel 9                                                           
- Choose a system image, download, install. The emulator will now be available in Device Manager.                                                           
                                                           
## Step 7: Start Emulator                                                           
- Click the Play button beside the created virtual device.                                                           
- Wait for the Android phone interface to load completely.                                                           
                                                           
## Step 8: Run the Default Application                                                           
- Click the Run button in Android Studio, Select the emulator, Wait for the application to install.                                                           
                                                           
The application displays the default "Hello Android" screen.                                                             
Android Studio installation is correct.                                                             
Emulator setup is successful.                                                             
The Kotlin project can run successfully.                                                           
                                                           
## Step 9: Run the Default Application                                                           
- Connecting and Configuring a Physical Android Device for Testing                                                           
- Physical mobile device connected to USB instead of Emulator                                                           
                                                           
## Step 10: Enable Developer Options on the Mobile Device                                                           
By default, Android phones do not allow application debugging through USB. Therefore, Developer Options must be enabled.                                                           
                                                           
- Unlock the mobile phone.                                                           
- Open the Settings application.                                                           
- Scroll down and select About Phone.                                                           
- Locate the option: Build Number                                                           
- (The exact location may differ depending on the phone manufacturer.)                                                           
- Tap the Build Number option continuously 7 times.                                                           
- Enter the device password, PIN, or pattern if prompted.                                                           
- A message such as "You are now a developer" will appear.                                                           
- Developer Options are now enabled.                                                           
                                                           
## Step 11: Enable USB Debugging                                                           
USB Debugging allows Android Studio to communicate with the mobile device.                                                           
                                                           
- Go back to the main Settings screen.                                                           
- Open Developer Options.                                                           
- (It may be located under Additional Settings, System, or a similar section depending on the phone.)                                                           
- Locate the option: USB Debugging                                                           
- Turn USB Debugging ON.                                                           
- A confirmation message will appear.                                                           
- Click Allow or OK to enable it.                                                           
                                                           
## Step 12: Connect the Mobile Device to the Computer                                                           
- Use a USB cable to connect the mobile phone to the computer.                                                           
- Unlock the mobile phone.                                                           
- When a message appears asking "Allow USB Debugging?", select Allow.                                                           
- It is recommended to check "Always allow from this computer" so that the confirmation does not appear every time the device is connected.                                                           
                                                           
## Step 13: Select the Correct USB Connection Mode                                                           
- Some phones connect only for charging by default.                                                           
- Pull down the notification panel on the phone.                                                           
- Tap the USB connection notification.                                                           
- Select a mode such as File Transfer (MTP) or Transferring Files.                                                           
- This allows the computer and Android Studio to properly detect the device.                                                           
                                                           
## Step 14: Verify That Android Studio Detects the Device                                                           
Open Android Studio.                                                             
Look at the device selection dropdown near the top toolbar.                                                             
Verify that your mobile device name appears in the list. eg: Samsung Galaxy M14, Pixel 9. If the device appears, Android Studio has successfully connected to the phone.                                                           
                                                           
## Step 15: Run the Application on the Mobile Device                                                           
- Select the connected mobile device from the device dropdown.                                                           
- Click the Run button in Android Studio.                                                           
                                                           
Android Studio will:                                                           
- Build the application.                                                           
- Install the APK on the mobile device.                                                           
- Launch the application automatically.                                                           
- Wait until the application opens on the phone....                                                           
                                                           
## Step 16: Understanding the Default Application                                                           
Open the Main Kotlin File                                                             
After the project has been created successfully:                                                             
In the left panel of Android Studio, expand:                                                           
- kotlin + java                                                           
- package name (example: com.example.animalsandsounds)                                                           
- MainActivity.kt                                                           
- Double-click MainActivity.kt to open the file.                                                           
                                                           
## Step 17: Understand the Default Code Generated by Android Studio                                                           
By default, Android Studio creates a basic Jetpack Compose application.                                                             
The important sections are:                                                           
                                                           
### 17.1. MainActivity Class                                                           
```kotlin                                                           
class MainActivity : ComponentActivity()                                                           
```                                                           
This is the starting point of the application.                                                             
When the user opens the application:                                                           
- Application starts                                                           
- MainActivity is created                                                           
- onCreate() method executes                                                           
                                                           
### 17.2. The onCreate() Method                                                           
```kotlin                                                           
override fun onCreate(savedInstanceState: Bundle?)                                                           
```                                                           
This method runs automatically when the application starts.                                                             
It is responsible for performing the initial setup of the application.                                                           
                                                           
### 17.3. setContent()                                                           
Inside onCreate(), you will find:                                                           
```kotlin                                                           
setContent {                                                           
}                                                           
```                                                           
This tells Android: "Everything written inside this block should be displayed as the application's user interface."                                                           
                                                           
### 17.4. Composable Functions                                                           
You will see functions starting with                                                           
```kotlin                                                           
@Composable                                                           
```                                                           
Example:                                                           
```kotlin                                                           
@Composable                                                           
fun Greeting() {                                                           
}                                                           
```                                                           
A composable function is a function used to create user interface elements such as:                                                           
- Text                                                           
- Images                                                           
- Buttons                                                           
- Layouts                                                           
                                                           
Think of it as a reusable piece of the screen.                                                           
                                                           
### 17.5. Preview Function                                                           
At the bottom of the file, there is a preview function.                                                             
Example:                                                           
```kotlin                                                           
@Preview                                                           
```                                                           
This allows Android Studio to display a preview of the user interface without running the emulator.                                                             
It is only used during development and does not affect the final application.                                                           
                                                           
## Step 18: Run the Default Application                                                           
Before making any modifications:                                                           
- Click the Run button.                                                           
- Select the Android emulator.                                                           
- Wait for the application to install.                                                           
                                                           
Expected output: Hello Android                                                           
                                                           
## Step 19: Prepare the Resources Required for Assignment 1A                                                           
For Assignment 1A, collect the following files:                                                           
                                                           
Image file:                                                           
- cat.png                                                           
                                                           
This image will be displayed on the screen.                                                           
                                                           
Audio file:                                                           
- meow.mp3                                                           
                                                           
This sound will play when the user clicks the cat image.                                                           
                                                           
## Step 20: Add the Cat Image to the Drawable Folder                                                           
The drawable folder stores images.                                                           
                                                           
Follow these steps:                                                           
- In Android Studio, expand: res                                                           
- Locate: drawable                                                           
- Right-click drawable.                                                           
- Copy the cat.png file into this folder.                                                           
                                                           
After adding the file, the structure should appear as:                                                           
```text                                                           
res                                                           
 └── drawable                                                           
       └── cat.png                                                           
```                                                           
                                                           
## Step 21: Create the Raw Folder for Audio Files                                                           
By default, Android Studio may not create a raw folder.                                                             
To create it:                                                           
- Right-click the res folder.                                                           
- Select: New → Android Resource Directory                                                           
- In the Resource Type dropdown, select: raw                                                           
- Click OK.                                                           
                                                           
The structure will become:                                                           
```text                                                           
res                                                           
 ├── drawable                                                           
 └── raw                                                           
```                                                           
                                                           
## Step 22: Add the Audio File                                                           
Open the raw folder.                                                             
Copy meow.mp3 into the folder.                                                           
                                                           
Now the structure should be:                                                           
```text                                                           
res                                                           
 ├── drawable                                                           
 │      └── cat.png                                                           
 │                                                           
 └── raw                                                           
        └── meow.mp3                                                           
```                                                           
                                                           
## Step 23: Remove the Default Greeting Screen                                                           
Initially, the application contains a Greeting() function that displays text.                                                             
Example:                                                           
Hello Android                                                           
                                                           
Since Assignment 1A requires an image instead of text, the default screen must be replaced.                                                             
Replace the call to Greeting()                                                           
                                                           
Inside MainActivity, locate:                                                           
```kotlin                                                           
Greeting(                                                           
    name = "Android",                                                           
    modifier = Modifier.padding(innerPadding)                                                           
)                                                           
```                                                           
Replace it with:                                                           
```kotlin                                                           
CatScreen(                                                           
    modifier = Modifier.padding(innerPadding)                                                           
)                                                           
```                                                           
                                                           
## Step 24: Create a New Composable Function for the Cat Screen                                                           
Remove the old Greeting() function.                                                             
Create:                                                           
```kotlin                                                           
@Composable                                                           
fun CatScreen(modifier: Modifier = Modifier) {                                                           
}                                                           
```                                                           
This creates an empty screen that will later contain the cat image.                                                           
                                                           
## Step 25: Update the Preview Function                                                           
The existing preview may still refer to Greeting().                                                             
Replace it with:                                                           
```kotlin                                                           
@Preview(showBackground = true)                                                           
@Composable                                                           
fun CatScreenPreview() {                                                           
    ThemeName {                                                           
        CatScreen()                                                           
    }                                                           
}                                                           
```                                                           
Note: Replace ThemeName with the actual theme generated by your project (example: AnimalsAndSoundsTheme).                                                           
                                                           
## Step 26: Run the Application Again                                                           
Run the application.                                                             
Expected result: A blank screen                                                           
                                                           
This is expected because:                                                           
- Greeting removed                                                           
- CatScreen created                                                           
- No UI elements added yet                                                           
- Blank screen appears                                                           
                                                           
At this point, the project is successfully prepared for adding the cat image.                                                           
                                                           
## Step 27: Displaying the Cat Image and Implementing the Meow Sound (Assignment 1A)                                                           
Add Required Import Statements for Displaying Images                                                           
                                                           
To display an image in Jetpack Compose, additional components need to be imported.                                                             
At the top of MainActivity.kt, add the following import statements:                                                           
```kotlin                                                           
import androidx.compose.foundation.Image                                                           
import androidx.compose.ui.layout.ContentScale                                                           
import androidx.compose.ui.res.painterResource                                                           
```                                                           
                                                           
Understanding the purpose of each import:                                                           
1. Image                                                           
```kotlin                                                           
import androidx.compose.foundation.Image                                                           
```                                                           
This provides the Image() composable, which is used to display pictures on the mobile application screen.                                                             
Without this import, Android Studio will not recognize the Image() function.                                                           
                                                           
2. ContentScale                                                           
```kotlin                                                           
import androidx.compose.ui.layout.ContentScale                                                           
```                                                           
This controls how the image is resized or fitted within the available space.                                                             
Example: ContentScale.Fit displays the complete image while maintaining its original proportions.                                                           
                                                           
3. painterResource                                                           
```kotlin                                                           
import androidx.compose.ui.res.painterResource                                                           
```                                                           
This is used to load image files stored inside the drawable folder.                                                             
Example:                                                           
```text                                                           
res                                                           
 └── drawable                                                           
       └── cat.png                                                           
```                                                           
Android automatically creates a reference:                                                           
```kotlin                                                           
R.drawable.cat                                                           
```                                                           
which points to the cat.png file.                                                           
                                                           
## Step 28: Add the Image Component Inside CatScreen()                                                           
Initially, the function is empty:                                                           
```kotlin                                                           
@Composable                                                           
fun CatScreen(modifier: Modifier = Modifier) {                                                           
}                                                           
```                                                           
Replace it with:                                                           
```kotlin                                                           
@Composable                                                           
fun CatScreen(modifier: Modifier = Modifier) {                                                           
    Image(                                                           
        painter = painterResource(id = R.drawable.cat),                                                           
        contentDescription = "Cat",                                                           
        modifier = modifier,                                                           
        contentScale = ContentScale.Fit                                                           
    )                                                           
}                                                           
```                                                           
                                                           
Understanding the Image Code                                                           
- `painter = painterResource(id = R.drawable.cat)`                                                             
  This performs the following operation: `R.drawable.cat` locate cat.png, load the image into memory, provide it to Image()                                                           
- `contentDescription = "Cat"`                                                             
  This is used for accessibility. If a visually impaired user uses a screen reader, it can announce the description "Cat" for the image.                                                           
- `modifier = modifier`                                                             
  This applies the modifier information passed from MainActivity, such as the padding added by the Scaffold.                                                           
                                                           
## Step 29: Run the Application and Verify the Image                                                           
Run the application.                                                           
                                                           
Expected result:                                                           
The cat image appears on the screen.                                                           
                                                           
At this stage, the image may appear very small and positioned at the top-left corner. This is expected because no size or alignment has been specified yet.                                                           
                                                           
## Step 30: Import Components Required for Image Resizing                                                           
To change the image dimensions, add the following imports:                                                           
```kotlin                                                           
import androidx.compose.foundation.layout.size                                                           
import androidx.compose.ui.unit.dp                                                           
```                                                           
                                                           
Understanding These Imports:                                                           
- size                                                           
- This allows a specific width and height to be assigned to a UI component.                                                           
- Example: `Modifier.size(250.dp)` will make the image approximately 250 density-independent pixels wide and high.                                                           
- dp                                                           
- dp stands for Density Independent Pixels.                                                           
- Android uses dp instead of normal pixels because different devices have different screen resolutions and pixel densities.                                                           
- Using dp helps maintain a similar physical size across different devices.                                                           
                                                           
## Step 31: Modify the Image Size                                                           
Locate:                                                           
```kotlin                                                           
modifier = modifier                                                           
```                                                           
Replace it with:                                                           
```kotlin                                                           
modifier = modifier.size(250.dp)                                                           
```                                                           
                                                           
## Step 32: Run the Application and Test Different Image Sizes                                                           
Run the application again.                                                             
Observe the change in the cat image size.                                                           
                                                           
You may test different values such as:                                                           
- `Modifier.size(100.dp)`                                                           
- `Modifier.size(400.dp)`                                                           
                                                           
to understand the effect of changing the dimensions.                                                             
After experimentation, select a suitable size.                                                           
                                                           
In this implementation:                                                           
- `Modifier.size(250.dp)`                                                           
was selected as the most appropriate image size.                                                           
                                                           
## Step 33: Add Required Imports for Playing Audio and Handling Click Events                                                           
To allow the user to click the image and play a sound, add:                                                           
```kotlin                                                           
import android.media.MediaPlayer                                                           
import androidx.compose.foundation.clickable                                                           
import androidx.compose.ui.platform.LocalContext                                                           
```                                                           
                                                           
Purpose of These Imports:                                                           
- MediaPlayer                                                           
- It is used to load and play audio files.                                                           
- Example: meow.mp3                                                           
- MediaPlayer                                                           
- Sound can be played                                                           
- clickable                                                           
- It allows UI components such as images or buttons to respond when the user touches them.                                                           
- LocalContext                                                           
- It provides the current Android application context, which is required by MediaPlayer to access application resources.                                                           
                                                           
## Step 34: Create the MediaPlayer Object                                                           
Inside CatScreen(), before the Image() component, add:                                                           
```kotlin                                                           
val context = LocalContext.current                                                           
val mediaPlayer = MediaPlayer.create(                                                           
    context,                                                           
    R.raw.meow                                                           
)                                                           
```                                                           
                                                           
Understanding the Code:                                                           
- LocalContext.current                                                           
- Provides information about the currently running application.                                                           
- MediaPlayer.create()                                                           
- Performs the following operation: Application Context, Locate meow.mp3 in raw folder, Prepare the audio file for playback                                                           
                                                           
## Step 35: Make the Image Clickable                                                           
Modify the image modifier.                                                           
                                                           
Current code:                                                           
```kotlin                                                           
modifier = modifier.size(250.dp)                                                           
```                                                           
Replace it with:                                                           
```kotlin                                                           
modifier = modifier                                                           
    .size(250.dp)                                                           
    .clickable {                                                           
        mediaPlayer.start()                                                           
    }                                                           
```                                                           
                                                           
Understanding Modifier Chaining:                                                           
A modifier can contain multiple instructions.                                                           
                                                           
The execution flow is:                                                           
- Image                                                           
- Apply size of 250.dp                                                           
- Enable touch interaction                                                           
- When touched, execute mediaPlayer.start()                                                           
- Play meow.mp3                                                           
                                                           
## Step 36: Run and Verify Assignment 1A                                                           
Run the application.                                                           
                                                           
Expected result:                                                           
- The cat image should be visible with the selected size.                                                           
- When the user touches the cat image, the "meow" sound should play.                                                           
                                                           
## Step 37 - Building Assignment 1B – Cat and Dog Screen                                                           
Step 1: Create ScreenA.kt for the Cat Screen                                                             
The Cat Screen will display a single cat image and play the meow sound when the image is clicked.                                                           
                                                           
1.1 Create a New Kotlin File                                                             
Open Android Studio.                                                           
                                                           
In the Project panel on the left side, navigate to:                                                           
- app → java → com.example.a1a                                                           
                                                           
Right-click on the package name com.example.a1a.                                                             
Select: New → Kotlin Class/File                                                             
Enter the file name: ScreenA                                                             
Select the type as: File                                                             
Click OK.                                                           
                                                           
A new file named ScreenA.kt will be created.                                                           
                                                           
Step 2: Create a Composable Function for the Cat Screen                                                             
Inside ScreenA.kt, create a composable function named CatScreen.                                                           
```kotlin                                                           
@Composable                                                           
fun CatScreen(modifier: Modifier = Modifier) {                                                           
}                                                           
```                                                           
This function represents the first screen of the application.                                                           
                                                           
Step 3: Move the Cat Screen Code to ScreenA.kt                                                             
Open MainActivity.kt.                                                             
Locate the entire @Composable function that contains the UI code for displaying the Cat image and playing the meow sound.                                                             
Select the complete @Composable function and cut it from MainActivity.kt.                                                           
                                                           
Open the previously created ScreenA.kt file.                                                             
Paste the copied @Composable function inside ScreenA.kt.                                                             
Rename the function appropriately as CatScreen (if not already renamed).                                                             
Ensure that all required import statements are added to ScreenA.kt.                                                             
Save all the files.                                                             
Run the application.                                                           
                                                           
Verify that:                                                           
- The Cat image is displayed successfully.                                                           
- Clicking on the Cat image plays the meow sound.                                                           
- The application runs without any errors.                                                           
                                                           
After successful testing, the first screen creation is completed.                                                           
                                                           
Step 4: Create ScreenB.kt for the Cat and Dog Screen                                                             
Go to the package:                                                           
- app → java → com.example.a1a                                                           
                                                           
Right-click on the package.                                                             
Select: New → Kotlin Class/File                                                             
Enter the file name: ScreenB                                                             
Select the type as: File                                                             
Click OK.                                                           
                                                           
A new file named ScreenB.kt will be created.                                                           
                                                           
Step 5: Create the Composable Function                                                             
Inside ScreenB.kt, create a new composable function named CatandDogScreen.                                                           
```kotlin                                                           
@Composable                                                           
fun CatandDogScreen(modifier: Modifier = Modifier) {                                                           
}                                                           
```                                                           
This function represents the second screen of the application.                                                           
                                                           
Step 6: Create MediaPlayer Objects for Both Sounds                                                             
Inside CatandDogScreen, create two MediaPlayer objects.                                                           
```kotlin                                                           
val context = LocalContext.current                                                           
val catSound = MediaPlayer.create(                                                           
    context,                                                           
    R.raw.meow                                                           
)                                                           
val dogSound = MediaPlayer.create(                                                           
    context,                                                           
    R.raw.bowbow                                                           
)                                                           
```                                                           
The first MediaPlayer will play the cat sound and the second MediaPlayer will play the dog sound.                                                           
                                                           
Step 7: Create a Row Layout                                                             
To display the cat and dog images side by side, use a Row.                                                           
```kotlin                                                           
Row(                                                           
    modifier = modifier                                                           
) {                                                           
}                                                           
```                                                           
A Row places its child components horizontally from left to right.                                                           
                                                           
Step 8: Add the Cat Image                                                             
Inside the Row, add the Cat image.                                                           
```kotlin                                                           
Image(                                                           
    painter = painterResource(id = R.drawable.cat),                                                           
    contentDescription = "Cat",                                                           
    modifier = modifier                                                           
        .size(250.dp)                                                           
        .clickable {                                                           
            catSound.start()                                                           
        },                                                           
    contentScale = ContentScale.Fit                                                           
)                                                           
```                                                           
When the Cat image is clicked, the meow sound will play.                                                           
                                                           
Step 9: Add the Dog Image                                                             
Below the Cat image code (still inside the Row), add the Dog image.                                                           
```kotlin                                                           
Image(                                                           
    painter = painterResource(id = R.drawable.dog),                                                           
    contentDescription = "Dog",                                                           
    modifier = modifier                                                           
        .size(250.dp)                                                           
        .clickable {                                                           
            dogSound.start()                                                           
        },                                                           
    contentScale = ContentScale.Fit                                                           
)                                                           
```                                                           
When the Dog image is clicked, the BowBow sound will play.                                                           
                                                           
## Assignment 1 - Animals and Sounds                                                           
1a) Show a picture of a Cat. If you click on the Cat, a sound "Meeoo" should be heard 1b) Show a picture of a Cat and a Dog next to each other. If you click on the Cat, a sound "Meeeoo" should be heard. If you click on the Dog, a sound "BowBow" should be heard. 1c) Show a gallery of 20 animals with their names below each photograph using 2 rows and 10 columns. Implement a vertical scrollbar. 1d) Implement a search bar to type the name - If "C" is typed, it should show only Cow and Camel. If "CA" is typed, it should only the picture of camel. 1e) Build a list of 100 animals (birds, reptiles, insects, fish can be added). Search using a Voice Interface. eg. If you say "Crocodile" only the picture of Crocodile should be shown. There should be a back button to get back to the main list OR an option to search for another animal using a Voice Command.                                                           
