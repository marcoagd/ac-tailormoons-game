package org.academiadecodigo.tailormoons.tailormoons.arena;


/**
 * Constant Position class stores all the initial positions of our Game Objects (Platforms, Ladders, Keys, Enemies);
 * Considerations:  Player height 50px, width 35px, max jump height 75px, max jump length 150px;
 * Platforms thickness 20px, distance between platforms 125px (player height + jump height)
 * Ladder width 40px;
 * Keys width 30px, height 20px, float at 25px height;
 */
public class ConstantPosition {

    public static final int PLATFORM_WIDTH = 30;
    public static final int PLATFORM_HEIGHT = 20;

    public static final int LADDER_WIDTH = 40;
    public static final int LADDER_HEIGHT = 15;

    public static final int KEY_WIDTH = 30;
    public static final int KEY_HEIGHT = 15;

    public static final int CAGE_WIDTH = 100;
    public static final int CAGE_HEIGHT = 100;

    private static final int ENEMY_WIDTH = 35;
    private static final int ENEMY_HEIGHT = 45;


    public static final int[] PLATFORMS_AMOUNT = {15, 18, 20, 20};
    public static final int[] LADDERS_AMOUNT = {4, 4, 4, 4};
    public static final int[] KEYS_AMOUNT = {6, 6, 8, 7};
    public static final int[] ENEMIES_AMOUNT = {3, 5, 7, 4};


    public static final int[][][] PLATFORMS = {
            //LEVEL 1
            {
                    {0, 580, 800, PLATFORM_HEIGHT}, {0, 425, 130, PLATFORM_HEIGHT}, {500, 425, 150, PLATFORM_HEIGHT},
                    {690, 425, 30, PLATFORM_HEIGHT}, {250, 375, 75, PLATFORM_HEIGHT}, {375, 320, 120, PLATFORM_HEIGHT},
                    {690, 275, 110, PLATFORM_HEIGHT}, {0, 275, 200, PLATFORM_HEIGHT}, {240, 150, 50, PLATFORM_HEIGHT},
                    {0, 120, 130, PLATFORM_HEIGHT}, {170, 120, 30, PLATFORM_HEIGHT}, {330, 120, 65, PLATFORM_HEIGHT},
                    {435, 120, 215, PLATFORM_HEIGHT}, {690, 120, 30, PLATFORM_HEIGHT}, {170, 425, 30, PLATFORM_HEIGHT}
            },

            //LEVEL 2
            {
                    {0, 480, 160, PLATFORM_HEIGHT}, {200, 480, 200, PLATFORM_HEIGHT}, {440, 480, 200, PLATFORM_HEIGHT},
                    {680, 480, 80, PLATFORM_HEIGHT}, {60, 340, 100, PLATFORM_HEIGHT}, {200, 340, 100, PLATFORM_HEIGHT},
                    {300, 320, 100, PLATFORM_HEIGHT}, {400, 300, 100, PLATFORM_HEIGHT}, {500, 280, 100, PLATFORM_HEIGHT},
                    {600, 260, 100, PLATFORM_HEIGHT}, {0, 220, 160, PLATFORM_HEIGHT}, {380, 200, 100, PLATFORM_HEIGHT},
                    {60, 100, 100, PLATFORM_HEIGHT}, {200, 100, 200, PLATFORM_HEIGHT}, {450, 100, 200, PLATFORM_HEIGHT},
                    {700, 100, 100, PLATFORM_HEIGHT}, {580, 380, 180, PLATFORM_HEIGHT}, {0, 580, 800, PLATFORM_HEIGHT}
            },

            //Level 3
            {
                    {0, 580, 800, PLATFORM_HEIGHT}, {300, 500, 20, 20}, {480, 500, 20, 20},
                    {0, 460, 40, PLATFORM_HEIGHT}, {80, 460, 300, PLATFORM_HEIGHT}, {420, 460, 300, PLATFORM_HEIGHT},
                    {760, 460, 40, PLATFORM_HEIGHT}, {0, 340, 40, PLATFORM_HEIGHT}, {80, 340, 300, PLATFORM_HEIGHT},
                    {420, 340, 300, PLATFORM_HEIGHT}, {760, 340, 40, PLATFORM_HEIGHT}, {150, 250, 50, PLATFORM_HEIGHT},
                    {70, 180, 50, PLATFORM_HEIGHT}, {150, 110, 50, PLATFORM_HEIGHT}, {300, 180, 50, PLATFORM_HEIGHT},
                    {400, 130, 50, PLATFORM_HEIGHT}, {520, 100, 50, PLATFORM_HEIGHT}, {700, 120, 100, PLATFORM_HEIGHT},
                    {300, 540, 20, 20}, {480, 540, 20, 20}
            },

            //LEVEL 4
            {
                    {0, 580, 200, PLATFORM_HEIGHT}, {0, 435, 130, PLATFORM_HEIGHT}, {0, 290, 200, PLATFORM_HEIGHT},
                    {70, 145, 130, PLATFORM_HEIGHT}, {350, 145, 50, PLATFORM_HEIGHT}, {400, 220, 50, PLATFORM_HEIGHT},
                    {350, 290, 50, PLATFORM_HEIGHT}, {500, 290, 50, PLATFORM_HEIGHT}, {350, 435, 50, PLATFORM_HEIGHT},
                    {500, 435, 50, PLATFORM_HEIGHT}, {610, 40, 20, 20}, {600, 145, 130, PLATFORM_HEIGHT},
                    {600, 290, 200, PLATFORM_HEIGHT}, {670, 435, 130, PLATFORM_HEIGHT}, {600, 580, 200, PLATFORM_HEIGHT},
                    {0, 145, 30, PLATFORM_HEIGHT}, {770, 145, 30, PLATFORM_HEIGHT}, {170, 435, 30, PLATFORM_HEIGHT},
                    {600, 435, 30, PLATFORM_HEIGHT}, {610, 90, 20, 20}
            }

    };


    public static final int[][][] LADDERS = {
            //LEVEL1
            {
                    {130, 375, LADDER_WIDTH, 205}, {650, 70, LADDER_WIDTH, 510}, {130, 70, LADDER_WIDTH, 205},
                    {395, 70, LADDER_WIDTH, 250}
            },

            //LEVEL 2
            {
                    {20, 300, LADDER_WIDTH, 180}, {160, 50, LADDER_WIDTH, 530}, {400, 430, LADDER_WIDTH, 150},
                    {640, 430, LADDER_WIDTH, 150}
            },

            //LEVEL 3
            {
                    {40, 300, 40, 280}, {380, 300, 40, 280}, {720, 300, 40, 280}, {200, 100, LADDER_WIDTH, 180}
            },

            //LEVEL 4
            {
                    {130, 385, LADDER_WIDTH, 195}, {30, 95, LADDER_WIDTH, 195}, {730, 95, LADDER_WIDTH, 195},
                    {630, 385, LADDER_WIDTH, 195}
            }
    };


    public static final int[][][] KEYS = {
            //LEVEL1
            {
                    {20, 370, KEY_WIDTH, KEY_HEIGHT}, {20, 220, KEY_WIDTH, KEY_HEIGHT}, {350, 65, KEY_WIDTH, KEY_HEIGHT},
                    {750, 220, KEY_WIDTH, KEY_HEIGHT}, {550, 370, KEY_WIDTH, KEY_HEIGHT}, {750, 525, KEY_WIDTH, KEY_HEIGHT}
            },

            //LEVEL 2
            {
                    {10, 190, KEY_WIDTH, KEY_HEIGHT}, {450, 260, KEY_WIDTH, KEY_HEIGHT}, {470, 60, KEY_WIDTH, KEY_HEIGHT},
                    {660, 230, KEY_WIDTH, KEY_HEIGHT}, {710, 360, KEY_WIDTH, KEY_HEIGHT}, {760, 540, KEY_WIDTH, KEY_HEIGHT}
            },

            //LEVEL 3
            {
                    {260, 500, KEY_WIDTH, KEY_HEIGHT}, {330, 550, KEY_WIDTH, KEY_HEIGHT}, {510, 550, KEY_WIDTH, KEY_HEIGHT},
                    {200, 380, KEY_WIDTH, KEY_HEIGHT}, {570, 380, KEY_WIDTH, KEY_HEIGHT}, {40, 60, KEY_WIDTH, KEY_HEIGHT},
                    {500, 200, KEY_WIDTH, KEY_HEIGHT}, {640, 180, KEY_WIDTH, KEY_HEIGHT}
            },

            //LEVEL 4
            {
                    {30, 380, KEY_WIDTH, KEY_HEIGHT}, {100, 235, KEY_WIDTH, KEY_HEIGHT}, {410, 185, KEY_WIDTH, KEY_HEIGHT},
                    {640, 50, KEY_WIDTH, KEY_HEIGHT}, {750, 330, KEY_WIDTH, KEY_HEIGHT}, {750, 530, KEY_WIDTH, KEY_HEIGHT},
                    {435, 360, KEY_WIDTH, KEY_HEIGHT}
            }
    };


    public static final int[][] CAT_CAGES = {
            //LEVEL1

            {10, 20, CAGE_WIDTH, CAGE_HEIGHT},

            //LEVEL 2

            {700, 0, CAGE_WIDTH, CAGE_HEIGHT},

            //LEVEL 3

            {700, 20, CAGE_WIDTH, CAGE_HEIGHT},

            //LEVEL 4

            {100, 45, CAGE_WIDTH, CAGE_HEIGHT}

    };


    public static final int[][][] ENEMIES = {

            //LEVEL 1
            {
                    {325, 82, ENEMY_WIDTH, ENEMY_HEIGHT, 325, 698},
                    {350, 542, ENEMY_WIDTH, ENEMY_HEIGHT, 100, 765},
                    {500, 387, ENEMY_WIDTH, ENEMY_HEIGHT, 500, 685}
            },

            //LEVEL 2
            {
                    {100, 62, ENEMY_WIDTH, ENEMY_HEIGHT, 100, 350},
                    {450, 542, ENEMY_WIDTH, ENEMY_HEIGHT, 0, 765},
                    {650, 440, ENEMY_WIDTH, ENEMY_HEIGHT, 0, 700},
                    {580, 342, ENEMY_WIDTH, ENEMY_HEIGHT, 580, 745},
                    {750, 542, ENEMY_WIDTH, ENEMY_HEIGHT, 0, 765}
            },

            //LEVEL 3
            {
                    {100, 542, ENEMY_WIDTH, ENEMY_HEIGHT, 15, 260},
                    {355, 542, ENEMY_WIDTH, ENEMY_HEIGHT, 320, 445},
                    {515, 542, ENEMY_WIDTH, ENEMY_HEIGHT, 515, 765},
                    {35, 423, ENEMY_WIDTH, ENEMY_HEIGHT, 35, 765},
                    {465, 423, ENEMY_WIDTH, ENEMY_HEIGHT, 35, 765},
                    {35, 300, ENEMY_WIDTH, ENEMY_HEIGHT, 35, 360},
                    {450, 300, ENEMY_WIDTH, ENEMY_HEIGHT, 450, 765}
            },

            //LEVEL 4
            {
                    {35, 397, ENEMY_WIDTH, ENEMY_HEIGHT, 35, 180},
                    {640, 542, ENEMY_WIDTH, ENEMY_HEIGHT, 600, 750},
                    {690, 397, ENEMY_WIDTH, ENEMY_HEIGHT, 600, 750},
                    {610, 252, ENEMY_WIDTH, ENEMY_HEIGHT, 600, 750}
            }
    };


    public static final int[][] PLAYER_POSITION = {
            //LEVEL 1
            {30, 530},
            //LEVEL 2
            {400, 150},
            //LEVEL 3
            {150, 60},
            //LEVEL 4
            {30, 530}
    };
}
