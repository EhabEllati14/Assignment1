package com.example.assignment1;

public class WorkoutExercises {
    //here the all exercise went to the same class but with different type only
    private String exersiceName;
    private int rounds;
    private int repetitions;
    private int ImageId;
    private String description;
    private double calories;
    private String level;
    private String type;

    public WorkoutExercises(String exersiceName, int rounds, int repetitions, int imageId, String description, double calories, String level, String type) {
        this.exersiceName = exersiceName;
        this.rounds = rounds;
        this.repetitions = repetitions;
        ImageId = imageId;
        this.description = description;
        this.calories = calories;
        this.level = level;
        this.type = type;
    }

    public static final WorkoutExercises[] chestWorkout = {
            new WorkoutExercises("Bench Press", 4, 12, R.drawable.brench_press,
                    "Targets the pectoral muscles, triceps, and shoulders. Great for upper body strength and chest mass.",
                    80, "Hard", "Chest"),

            new WorkoutExercises("Incline Bench Press", 4, 12, R.drawable.inclinebench,
                    "Focuses on the upper chest and front deltoids, enhancing upper chest development.",
                    75, "Hard", "Chest"),

            new WorkoutExercises("Decline Bench Press", 4, 12, R.drawable.decline_brench_press,
                    "Activates lower chest muscles, contributing to balanced chest definition.",
                    70, "Medium", "Chest"),

            new WorkoutExercises("Push Ups", 10, 20, R.drawable.push_ups,
                    "Engages the chest, triceps, and shoulders. Great for building functional strength.",
                    100, "Easy", "Chest"),

            new WorkoutExercises("Chest Fly", 5, 15, R.drawable.flychest,
                    "Isolates and strengthens the chest muscles, enhancing definition.",
                    90, "Medium", "Chest"),

            new WorkoutExercises("Cable Crossover", 5, 10, R.drawable.cable,
                    "Provides constant tension for muscle growth and sculpts the chest.",
                    85, "Medium", "Chest"),

            new WorkoutExercises("Landmine Press", 6, 12, R.drawable.landmine_press,
                    "Engages upper chest, shoulders, and core for strength and stability.",
                    95, "Hard", "Chest"),

            new WorkoutExercises("Svend Press", 5, 15, R.drawable.dumbbell_svend_press,
                    "Targets the inner chest with constant tension for enhanced muscle engagement.",
                    65, "Medium", "Chest")
    };

    public static final WorkoutExercises[] backs = {
            new WorkoutExercises("Lat PullDown", 5, 15, R.drawable.latpulldown,
                    "Develops the latissimus dorsi muscles, improving back width and upper body strength. Engages biceps and shoulder stabilizers.",
                    85, "Medium", "Back"),

            new WorkoutExercises("BarBell Back-Row", 4, 20, R.drawable.barbellrowback,
                    "Targets upper and lower back, rhomboids, lats, and traps. Improves posture and pulling strength.",
                    120, "Hard", "Back"),

            new WorkoutExercises("Seated Cable Row", 4, 15, R.drawable.seated_cable_row,
                    "Builds the middle back, engaging rhomboids, traps, and lats. Enhances symmetry with controlled movement.",
                    90, "Medium", "Back"),

            new WorkoutExercises("Face Pulls", 5, 12, R.drawable.facepulls,
                    "Targets rear deltoids and external rotators for shoulder and upper back health. Improves posture and shoulder stability.",
                    75, "Easy", "Back"),

            new WorkoutExercises("Back Extension", 4, 15, R.drawable.back_extension,
                    "Strengthens erector spinae for core stability, engages glutes and hamstrings, reducing lower back injury risk.",
                    65, "Medium", "Back"),

            new WorkoutExercises("Superman Exercise", 5, 20, R.drawable.superman_exercise,
                    "Activates the posterior chain, including lower back, glutes, and shoulders. Promotes spinal stability and core strength.",
                    50, "Easy", "Back"),

            new WorkoutExercises("T Bar Row", 4, 12, R.drawable.t_bar_row_muscles,
                    "Builds a thick upper back, targeting lats, traps, and rhomboids. Improves back density and pulling power.",
                    100, "Hard", "Back"),

            new WorkoutExercises("Svend Press", 4, 15, R.drawable.dumbbell_svend_press,
                    "Primarily a chest exercise but engages upper back for stabilization. Enhances core and shoulder stability.",
                    60, "Medium", "Back")
    };
    public static final WorkoutExercises[] legs = {
            new WorkoutExercises("Leg Press", 4, 15, R.drawable.narrow_stance_leg_press,
                    "A machine-based exercise that targets the quadriceps, hamstrings, and glutes. Ideal for building lower body strength.",
                    90, "Medium", "Legs"),

            new WorkoutExercises("Lunges", 4, 12, R.drawable.lunges,
                    "Targets the quadriceps, hamstrings, and glutes. Great for balance, coordination, and unilateral leg strength.",
                    85, "Medium", "Legs"),

            new WorkoutExercises("Calf Raises", 5, 20, R.drawable.calf_raise,
                    "Isolates the calf muscles, focusing on the gastrocnemius and soleus. Enhances lower leg strength and muscle definition.",
                    60, "Easy", "Legs"),

            new WorkoutExercises("Leg Curls", 4, 15, R.drawable.leg_curl,
                    "Primarily targets the hamstrings, helping to improve knee stability and overall leg strength.",
                    70, "Medium", "Legs"),

            new WorkoutExercises("Hip Thrust", 4, 12, R.drawable.hip_thurst,
                    "Focuses on the glutes, also engaging the hamstrings and lower back for improved hip extension strength.",
                    100, "Hard", "Legs"),

            new WorkoutExercises("Goblet Squats", 4, 15, R.drawable.goblet_squat,
                    "A squat variation that targets the quads, glutes, and core, with emphasis on maintaining upright posture.",
                    85, "Medium", "Legs"),

            new WorkoutExercises("Hack Squat", 4, 12, R.drawable.hack_squat,
                    "A machine-based squat variation targeting the quadriceps and glutes, providing support for the lower back.",
                    95, "Hard", "Legs")
    };
    public static final WorkoutExercises[] shoulders = {
            new WorkoutExercises("Dumbbell Shoulder Press", 4, 12, R.drawable.dumbbell_shoulder_press,
                    "A fundamental shoulder exercise targeting the deltoids, triceps, and upper pectorals. Builds shoulder strength and stability for pressing movements.",
                    80, "Medium", "Shoulder"),

            new WorkoutExercises("Lateral Deltoid Raise", 4, 15, R.drawable.dumbbell_lateral_raise,
                    "Isolates the lateral deltoids, enhancing shoulder width and definition. Helps to create a balanced, broader look.",
                    60, "Medium", "Shoulder"),

            new WorkoutExercises("Front Raises", 3, 15, R.drawable.plate_front_raise,
                    "Engages the front deltoids to build shoulder strength and improve posture. Great for emphasizing the front shoulder muscles.",
                    55, "Easy", "Shoulder"),

            new WorkoutExercises("Rear Delt Raise", 4, 12, R.drawable.rear_delt_raise,
                    "Targets the rear deltoids and upper back, helping improve posture and overall shoulder balance.",
                    70, "Medium", "Shoulder"),

            new WorkoutExercises("Cable Lateral Raise", 3, 15, R.drawable.cable_lateral_raise,
                    "Offers constant tension on the lateral deltoids, enhancing shoulder width and isolation of the side shoulder muscles.",
                    65, "Medium", "Shoulder"),

            new WorkoutExercises("Shoulder Shrug", 4, 20, R.drawable.overhead_shrug,
                    "Primarily works the trapezius muscles, supporting shoulder elevation and neck stability. Builds upper back and neck strength.",
                    60, "Easy", "Shoulder"),

            new WorkoutExercises("Plate Front Raises", 3, 12, R.drawable.plate_front_raise,
                    "A variation of front raises, engaging the front deltoids and stabilizer muscles. Enhances shoulder endurance and control.",
                    50, "Easy", "Shoulder"),

            new WorkoutExercises("Reverse Pec Deck", 4, 12, R.drawable.reverse_shoulder,
                    "Targets the rear deltoids and upper back, improving shoulder stability and promoting balanced shoulder development.",
                    75, "Medium", "Shoulder")
    };
    public static final WorkoutExercises[] biceps = {
            new WorkoutExercises("Drag Curl", 4, 12, R.drawable.drag_curl,
                    "An effective exercise that targets the biceps by dragging the bar up close to the torso, isolating the muscle and promoting growth without forearm activation.",
                    65, "Medium", "Biceps"),

            new WorkoutExercises("Dumbbell Curl", 4, 15, R.drawable.dumbell_curl,
                    "A classic bicep exercise that focuses on the biceps brachii. Enhances arm strength and helps achieve peak bicep contraction.",
                    60, "Easy", "Biceps"),

            new WorkoutExercises("Hammer Curl", 4, 12, R.drawable.hammer_curl,
                    "Targets both the biceps and the brachialis muscle, helping build arm thickness and strength. Great for overall bicep development.",
                    70, "Medium", "Biceps"),

            new WorkoutExercises("Preacher Curl", 3, 10, R.drawable.preacher_curl,
                    "Performed on a preacher bench, isolating the biceps for controlled contraction. Helps in building the peak of the bicep muscle.",
                    55, "Hard", "Biceps"),

            new WorkoutExercises("Incline Dumbbell Curl", 4, 12, R.drawable.dumbell_incline_curls,
                    "Performed on an incline bench to maximize bicep stretch and activation. Improves range of motion and muscle engagement.",
                    75, "Medium", "Biceps"),

            new WorkoutExercises("Cable Curls", 4, 15, R.drawable.cable_curls,
                    "Provides constant tension through the full range of motion, focusing on bicep contraction and control.",
                    65, "Medium", "Biceps"),

            new WorkoutExercises("Curl Zottman", 3, 10, R.drawable.curl_zottman,
                    "A unique curl variation that combines a bicep curl with a reverse curl, targeting both the biceps and forearms. Enhances grip strength and forearm development.",
                    80, "Hard", "Biceps"),

            new WorkoutExercises("Chin Up", 4, 8, R.drawable.chin_ups,
                    "A bodyweight exercise that not only targets the biceps but also engages the back and core. Essential for building strength and muscle endurance.",
                    90, "Hard", "Biceps")
    };
    public static final WorkoutExercises[] triceps = {
            new WorkoutExercises("Triceps Dips", 4, 12, R.drawable.triceps_dips,
                    "A bodyweight exercise that targets the triceps, shoulders, and chest. Great for building tricep strength and upper body endurance.",
                    80, "Medium", "Triceps"),

            new WorkoutExercises("Dumbbell Triceps Extension", 4, 12, R.drawable.dumbbell_triceps_extension,
                    "Focuses on isolating the triceps by extending the arms overhead. Enhances muscle size and strength in the triceps.",
                    65, "Medium", "Triceps"),

            new WorkoutExercises("Cable Triceps Extension", 4, 15, R.drawable.incline_cable_tricep_extension,
                    "Provides constant tension on the triceps through the full range of motion, promoting muscle activation and growth.",
                    70, "Medium", "Triceps"),

            new WorkoutExercises("Triceps Rope Push Down", 4, 15, R.drawable.triceps_rope_push_down,
                    "Targets the triceps using a rope attachment for improved range and contraction. Builds definition in the triceps.",
                    60, "Easy", "Triceps"),

            new WorkoutExercises("Diamond Push-Ups", 4, 10, R.drawable.diamond_push_ups_benefits,
                    "A bodyweight exercise that isolates the triceps, chest, and core. Effective for enhancing upper body strength and tricep engagement.",
                    90, "Hard", "Triceps"),

            new WorkoutExercises("Kickback Triceps", 3, 15, R.drawable.kickbacks,
                    "Targets the triceps with a strict, controlled movement. Perfect for defining and toning the back of the arms.",
                    50, "Easy", "Triceps"),

            new WorkoutExercises("Triceps Machine", 4, 12, R.drawable.triceps_machine,
                    "Machine-based exercise that isolates the triceps, ensuring proper form and muscle engagement. Ideal for controlled strength building.",
                    75, "Medium", "Triceps"),

            new WorkoutExercises("Seated Cable Back Triceps Machine", 4, 10, R.drawable.incline_cable_tricep_extension,
                    "Targets the triceps from a seated position, allowing a controlled, stable movement. Engages triceps and stabilizing muscles in the shoulders.",
                    85, "Hard", "Triceps")
    };

    public static final WorkoutExercises[] abs = {
            new WorkoutExercises("Alternate Heel Touchers", 4, 20, R.drawable.alternate_heel_touchers,
                    "An effective exercise targeting the obliques and core stability. Involves touching alternate heels to engage the side abs.",
                    50, "Easy", "Abs"),

            new WorkoutExercises("Wheel Ab", 3, 15, R.drawable.wheel_ab,
                    "A challenging exercise that strengthens the core, especially the rectus abdominis. Enhances core stability and control.",
                    70, "Hard", "Abs"),

            new WorkoutExercises("V-Up", 4, 12, R.drawable.v_up,
                    "Targets the entire core by lifting both the upper and lower body simultaneously, focusing on the lower abs and hip flexors.",
                    65, "Medium", "Abs"),

            new WorkoutExercises("Machine Crunch", 4, 15, R.drawable.machine_crunch,
                    "A machine-based exercise that isolates the abs for a controlled and intense contraction. Builds strength in the upper and lower abs.",
                    60, "Medium", "Abs"),

            new WorkoutExercises("Decline Sit-Ups", 3, 12, R.drawable.decline_sit_ups,
                    "Performed on a decline bench to increase resistance, this exercise targets the entire core, especially the upper abs.",
                    75, "Hard", "Abs"),

            new WorkoutExercises("Bicycle Crunch", 4, 20, R.drawable.bicycle_crunch,
                    "An intense oblique-targeting exercise involving alternating elbow-to-knee touches. Great for developing core definition.",
                    55, "Medium", "Abs"),

            new WorkoutExercises("Sit-Ups", 4, 15, R.drawable.sit_ups,
                    "A classic core exercise that strengthens the abdominal muscles. Effective for overall core endurance and stability.",
                    45, "Easy", "Abs"),

            new WorkoutExercises("Crunches Abs", 4, 20, R.drawable.crunches_abs,
                    "Isolates the upper abs through a small range of motion, perfect for building definition and muscle endurance in the abs.",
                    50, "Easy", "Abs")
    };


    public String getExersiceName() {
        return exersiceName;
    }

    public void setExersiceName(String exersiceName) {
        this.exersiceName = exersiceName;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return exersiceName ;
    }
}
