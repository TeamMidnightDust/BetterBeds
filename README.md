# BetterBeds
Removes the BlockEntityRenderer from the bed and replaces it with the default minecraft model renderer.  
This results in increased performance and resourcepack support!
  
But where's the catch, you may ask.  
Well, there is no catch, everything behaves the same as vanilla.
  
Why does the bed use a block entity renderer in the first place?  
When beds were added in 1.12, the game was still using the old block id system, which only allowed for a limited amount of ids.
Because 1.12 added many new blocks, the game was running out of ids, so the developers made the bed a block entity + renderer to save ids.
In 1.13 (The Flattening) a new id system was introduced, allowing for an unlimited amount of ids, but the bed block entity and it's renderer weren't touched.